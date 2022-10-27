package com.powelllaboratoriesfsm.features.location.shopRevisitStatus

import com.powelllaboratoriesfsm.features.location.shopdurationapi.ShopDurationApi
import com.powelllaboratoriesfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}