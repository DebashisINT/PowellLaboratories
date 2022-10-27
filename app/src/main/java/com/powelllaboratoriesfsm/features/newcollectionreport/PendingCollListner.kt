package com.powelllaboratoriesfsm.features.newcollectionreport

import com.powelllaboratoriesfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}