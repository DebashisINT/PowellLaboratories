package com.powelllaboratoriesfsm.features.viewAllOrder.orderOptimized

import com.powelllaboratoriesfsm.app.domain.ProductOnlineRateTempEntity
import com.powelllaboratoriesfsm.base.BaseResponse
import com.powelllaboratoriesfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}