package com.meeweel.myapplication.model.repository

import com.meeweel.myapplication.model.data.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}