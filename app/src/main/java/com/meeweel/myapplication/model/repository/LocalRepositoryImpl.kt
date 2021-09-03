package com.meeweel.myapplication.model.repository

import com.meeweel.myapplication.model.data.Weather
import com.meeweel.myapplication.model.data.convertHistoryEntityToWeather
import com.meeweel.myapplication.model.data.convertWeatherToEntity
import com.meeweel.myapplication.room.HistoryDao

class LocalRepositoryImpl(private val localDataSource: HistoryDao) : LocalRepository {
    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        return localDataSource.insert(convertWeatherToEntity(weather))
    }
}