package com.powelllaboratoriesfsm.features.viewAllOrder.interf

import com.powelllaboratoriesfsm.app.domain.NewOrderGenderEntity
import com.powelllaboratoriesfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}