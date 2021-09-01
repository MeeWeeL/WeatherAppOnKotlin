package com.meeweel.myapplication.model.repository

import com.meeweel.myapplication.model.data.Weather
import com.meeweel.myapplication.model.data.getRussianCities
import com.meeweel.myapplication.model.data.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer() = Weather()
    override fun getWeatherFromLocalStorageRus() = getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}