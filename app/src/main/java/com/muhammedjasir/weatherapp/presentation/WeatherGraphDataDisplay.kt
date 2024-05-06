package com.muhammedjasir.weatherapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhammedjasir.weatherapp.R
import com.muhammedjasir.weatherapp.domain.weather.WeatherData
import com.muhammedjasir.weatherapp.presentation.theme.ui.theme.font
import java.time.format.DateTimeFormatter

@Composable
fun WeatherGraphDataDisplay(
    modifier: Modifier = Modifier,
    textColor: Color = Color.White,
    tempValue: String,
    value: String
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = value,
            style = TextStyle(
                fontFamily = font,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
        )
        Text(text = tempValue,style = TextStyle(
            fontFamily = font,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )
        )
    }
}