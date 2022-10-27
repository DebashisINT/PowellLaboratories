package com.powelllaboratoriesfsm.features.dashboard.presentation.api.dayStartEnd

import com.powelllaboratoriesfsm.app.Pref
import com.powelllaboratoriesfsm.base.BaseResponse
import com.powelllaboratoriesfsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.powelllaboratoriesfsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.powelllaboratoriesfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.powelllaboratoriesfsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}