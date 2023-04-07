package com.powelllaboratoriesfsm.features.photoReg.present

import com.powelllaboratoriesfsm.app.domain.ProspectEntity
import com.powelllaboratoriesfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}