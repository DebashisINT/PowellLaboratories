package com.powelllaboratoriesfsm.features.viewAllOrder.interf

import com.powelllaboratoriesfsm.app.domain.NewOrderGenderEntity
import com.powelllaboratoriesfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}