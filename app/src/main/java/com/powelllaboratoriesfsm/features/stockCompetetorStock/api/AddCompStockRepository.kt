package com.powelllaboratoriesfsm.features.stockCompetetorStock.api

import com.powelllaboratoriesfsm.base.BaseResponse
import com.powelllaboratoriesfsm.features.orderList.model.NewOrderListResponseModel
import com.powelllaboratoriesfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.powelllaboratoriesfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}