package com.powelllaboratoriesfsm.features.viewAllOrder.interf

import com.powelllaboratoriesfsm.app.domain.NewOrderColorEntity
import com.powelllaboratoriesfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}