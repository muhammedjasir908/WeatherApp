package com.muhammedjasir.weatherapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhammedjasir.weatherapp.R
import com.muhammedjasir.weatherapp.presentation.theme.ui.theme.font

@Preview
@Composable
fun WeatherCard(
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Dubai",
                    style = TextStyle(
                        fontFamily = font,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Text(text = "Today 09:11 PM",
                    style = TextStyle(
                        fontFamily = font,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ))
            }
             Text(text = "24",
                style = TextStyle(
                fontFamily = font,
                fontWeight = FontWeight.SemiBold,
                fontSize = 80.sp
            )
            )
            Text(text = "Mostly Clear",
                style = TextStyle(
                    fontFamily = font,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                WeatherDataDisplay(value = 720, unit = "hpa", icon = R.drawable.ic_wind)
                WeatherDataDisplay(value = 32, unit = "%", icon = R.drawable.ic_drop)
                WeatherDataDisplay(value = 12, unit = "km/h", icon = R.drawable.ic_wind)
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = MaterialTheme.shapes.medium,
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 10.dp)
                ) {
                    Text(text = "Temperature",
                        style = TextStyle(
                            fontFamily = font,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                    LineChartFullCurved(
                        dataPoints = listOf(0.5f,0.8f,0.4f,0.9f,0.2f)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        WeatherGraphDataDisplay(tempValue = "24", value = "Morning")
                        WeatherGraphDataDisplay(tempValue = "30", value = "Noon")
                        WeatherGraphDataDisplay(tempValue = "20", value = "Evening")
                        WeatherGraphDataDisplay(tempValue = "16", value = "Night")
                    }
                }
            }
        }
    }
}