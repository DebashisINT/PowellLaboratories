package com.powelllaboratoriesfsm.features.reimbursement.api.deleteimageapi

import com.powelllaboratoriesfsm.app.Pref
import com.powelllaboratoriesfsm.base.BaseResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 08-02-2019.
 */
class DeleteImageRepo(val apiService: DeleteImageApi) {
    fun deleteReimbursementImage(Id: String): Observable<BaseResponse> {
        return apiService.deleteReimbursementImage(Pref.user_id!!, Pref.session_token!!, Id)
    }
}