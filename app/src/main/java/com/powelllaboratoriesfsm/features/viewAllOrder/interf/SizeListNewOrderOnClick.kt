package com.powelllaboratoriesfsm.features.viewAllOrder.interf

import com.powelllaboratoriesfsm.app.domain.NewOrderProductEntity
import com.powelllaboratoriesfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}