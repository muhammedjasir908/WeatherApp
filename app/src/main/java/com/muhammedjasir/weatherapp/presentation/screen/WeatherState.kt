package com.muhammedjasir.weatherapp.presentation.screen

import com.muhammedjasir.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
