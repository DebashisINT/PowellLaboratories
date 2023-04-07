package com.powelllaboratoriesfsm.features.location.api

import com.powelllaboratoriesfsm.features.location.shopdurationapi.ShopDurationApi
import com.powelllaboratoriesfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}