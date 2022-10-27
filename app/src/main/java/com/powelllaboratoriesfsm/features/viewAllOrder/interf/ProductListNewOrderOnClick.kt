package com.powelllaboratoriesfsm.features.viewAllOrder.interf

import com.powelllaboratoriesfsm.app.domain.NewOrderGenderEntity
import com.powelllaboratoriesfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}