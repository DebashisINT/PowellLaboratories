package com.powelllaboratoriesfsm.features.dashboard.presentation.api.dayStartEnd

import com.powelllaboratoriesfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.powelllaboratoriesfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}