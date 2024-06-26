package com.muhammedjasir.weatherapp.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LineChartFullCurved(
    dataPoints: List<Float>,
    color: Color = Color(0xFF453DE0),
    height: Dp = 200.dp
){
    //create canvas
    Canvas(modifier = Modifier
        .fillMaxWidth()
        .height(height)) {
        //create line where we will save all the points
        val linePath = Path()

        val xStep = size.width / (dataPoints.size -1)
        val yStep = size.height / (dataPoints.maxOrNull() ?: 1f)

        //iterate all the points
        dataPoints.forEachIndexed { index, dataPoint ->
            //create the points with cubicTo
            val xPos = index* xStep
            val yPos = size.height - (dataPoint*yStep)

            if(index == 0){
                linePath.moveTo(xPos,yPos)
            }else{
                //get the previous point
                val prevDataPoint = dataPoints[index -1]
                val prevXPos = (index -1)* xStep
                val prevYPos = size.height - (prevDataPoint*yStep)

                //create the control points for the curve
                val controlX1 = prevXPos + (xPos - prevXPos) /2
                val controlY1 = prevYPos
                val controlX2 = prevXPos + (xPos - prevXPos) / 2
                val controlY2 = yPos

                //create the curve with cubicTo - references from control points
                linePath.cubicTo(controlX1,controlY1,controlX2,controlY2,xPos,yPos)

                //if u want to create a circle in the point
                drawCircle(
                    color = color,
                    radius = 8.dp.toPx(),
                    center = Offset(xPos,yPos)
                )
            }
        }
        //draw the line
        drawPath(
            path = linePath,
            color = color,
            style = Stroke(width = 4.dp.toPx())
        )
    }
}

@Preview
@Composable
fun LineChartFullCurvedPrev(){
    LineChartFullCurved(
        dataPoints = listOf(0.5f,0.8f,0.4f,0.9f,0.2f,0.6f)
    )
}