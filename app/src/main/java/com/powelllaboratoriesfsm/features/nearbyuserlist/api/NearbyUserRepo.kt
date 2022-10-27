package com.powelllaboratoriesfsm.features.nearbyuserlist.api

import com.powelllaboratoriesfsm.app.Pref
import com.powelllaboratoriesfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.powelllaboratoriesfsm.features.newcollection.model.NewCollectionListResponseModel
import com.powelllaboratoriesfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}