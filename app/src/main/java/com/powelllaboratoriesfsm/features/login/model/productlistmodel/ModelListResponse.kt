package com.powelllaboratoriesfsm.features.login.model.productlistmodel

import com.powelllaboratoriesfsm.app.domain.ModelEntity
import com.powelllaboratoriesfsm.app.domain.ProductListEntity
import com.powelllaboratoriesfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}