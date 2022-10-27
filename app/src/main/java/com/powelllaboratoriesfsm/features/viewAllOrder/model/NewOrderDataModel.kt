package com.powelllaboratoriesfsm.features.viewAllOrder.model

import com.powelllaboratoriesfsm.app.domain.NewOrderColorEntity
import com.powelllaboratoriesfsm.app.domain.NewOrderGenderEntity
import com.powelllaboratoriesfsm.app.domain.NewOrderProductEntity
import com.powelllaboratoriesfsm.app.domain.NewOrderSizeEntity
import com.powelllaboratoriesfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

