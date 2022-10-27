package com.powelllaboratoriesfsm.features.stockAddCurrentStock.api

import com.powelllaboratoriesfsm.base.BaseResponse
import com.powelllaboratoriesfsm.features.location.model.ShopRevisitStatusRequest
import com.powelllaboratoriesfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.powelllaboratoriesfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.powelllaboratoriesfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.powelllaboratoriesfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}