package com.powelllaboratoriesfsm.features.weather.api

import com.powelllaboratoriesfsm.base.BaseResponse
import com.powelllaboratoriesfsm.features.task.api.TaskApi
import com.powelllaboratoriesfsm.features.task.model.AddTaskInputModel
import com.powelllaboratoriesfsm.features.weather.model.ForeCastAPIResponse
import com.powelllaboratoriesfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}