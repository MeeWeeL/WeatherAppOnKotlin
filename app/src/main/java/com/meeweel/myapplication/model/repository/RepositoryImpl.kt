package com.meeweel.myapplication.model.repository

import com.meeweel.myapplication.model.data.Weather
import com.meeweel.myapplication.model.data.getRussianCities
import com.meeweel.myapplication.model.data.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorageRus(): List<Weather> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalStorageWorld(): List<Weather> {
        return getWorldCities()
    }
}