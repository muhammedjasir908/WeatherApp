package com.muhammedjasir.weatherapp.domain.repository

import com.muhammedjasir.weatherapp.domain.util.Resource
import com.muhammedjasir.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}