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
import com.muhammedjasir.weatherapp.domain.weather.WeatherData
import com.muhammedjasir.weatherapp.presentation.theme.ui.theme.font
import java.time.format.DateTimeFormatter

@Composable
fun HourlyWeatherDisplay(
    weatherData: WeatherData,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White
){
    val formattedTime = remember(weatherData) {
        weatherData.time.format(
            DateTimeFormatter.ofPattern("HH:mm")
        )
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = formattedTime,
            style = TextStyle(
                fontFamily = font,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.LightGray
            ),)
        Image(painter = painterResource(id = weatherData.weatherType.iconRes),
            contentDescription = null,
            modifier = Modifier.width(40.dp))
        Text(
            text = "${weatherData.temperatureCelsius}°C",
            style = TextStyle(
                fontFamily = font,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = textColor
            ),)
    }
}