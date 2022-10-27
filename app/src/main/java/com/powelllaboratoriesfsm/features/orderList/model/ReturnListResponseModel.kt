package com.powelllaboratoriesfsm.features.orderList.model

import com.powelllaboratoriesfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}