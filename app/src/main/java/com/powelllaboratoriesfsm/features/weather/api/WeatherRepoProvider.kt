package com.powelllaboratoriesfsm.features.weather.api

import com.powelllaboratoriesfsm.features.task.api.TaskApi
import com.powelllaboratoriesfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}