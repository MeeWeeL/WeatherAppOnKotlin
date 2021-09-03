package com.meeweel.myapplication.model.data

import com.meeweel.myapplication.model.dto.WeatherDTO

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact = weatherDTO.fact!!
    return listOf(
        Weather(
            getDefaultCity(),
            fact.temp!!,
            fact.feels_like!!,
            fact.condition!!
        )
    )
}