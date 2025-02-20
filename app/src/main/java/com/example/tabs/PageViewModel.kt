package com.example.tabs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

class PageViewModel : ViewModel() {

    private val _city = MutableLiveData<String>()

    private val weatherData = mapOf(
        "Иркутск" to "Температура: -15°C, Ветер: 4 м/с, Влажность: 70%",
        "Москва" to "Температура: -5°C, Ветер: 3 м/с, Влажность: 80%",
        "Воронеж" to "Температура: 0°C, Ветер: 5 м/с, Влажность: 75%"
    )

    val weatherText: LiveData<String> = _city.switchMap { city ->
        MutableLiveData(weatherData[city] ?: "Данные о погоде отсутствуют")
    }

    fun setCity(city: String) {
        _city.value = city
    }
}
