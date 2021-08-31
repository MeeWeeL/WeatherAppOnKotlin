package com.meeweel.myapplication.model.repository

import com.meeweel.myapplication.model.data.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}