package com.muhammedjasir.weatherapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhammedjasir.weatherapp.presentation.theme.ui.theme.font

@Preview
@Composable
fun WeatherScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(15.dp)
    ) {
        WeatherCard()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Today", style = TextStyle(
                fontFamily = font,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp
            ))
            Text(text = "Next 7 Days", style = TextStyle(
                fontFamily = font,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp
            ))
        }
        LazyRow(
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }
}