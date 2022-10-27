package com.powelllaboratoriesfsm.features.location.shopRevisitStatus

import com.powelllaboratoriesfsm.base.BaseResponse
import com.powelllaboratoriesfsm.features.location.model.ShopDurationRequest
import com.powelllaboratoriesfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}