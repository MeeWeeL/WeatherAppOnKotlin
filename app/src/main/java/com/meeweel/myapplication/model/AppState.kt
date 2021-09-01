package com.meeweel.myapplication.model

import com.meeweel.myapplication.model.data.Weather

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}