package com.powelllaboratoriesfsm.features.newcollection.model

import com.powelllaboratoriesfsm.app.domain.CollectionDetailsEntity
import com.powelllaboratoriesfsm.base.BaseResponse
import com.powelllaboratoriesfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}