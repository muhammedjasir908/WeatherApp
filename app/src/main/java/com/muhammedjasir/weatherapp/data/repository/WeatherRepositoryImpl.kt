package com.muhammedjasir.weatherapp.data.repository

import com.muhammedjasir.weatherapp.data.mappers.toWeatherInfo
import com.muhammedjasir.weatherapp.data.remote.WeatherApi
import com.muhammedjasir.weatherapp.domain.repository.WeatherRepository
import com.muhammedjasir.weatherapp.domain.util.Resource
import com.muhammedjasir.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception){
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}