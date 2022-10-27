package com.powelllaboratoriesfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.powelllaboratoriesfsm.app.FileUtils
import com.powelllaboratoriesfsm.base.BaseResponse
import com.powelllaboratoriesfsm.features.NewQuotation.model.*
import com.powelllaboratoriesfsm.features.addshop.model.AddShopRequestData
import com.powelllaboratoriesfsm.features.addshop.model.AddShopResponse
import com.powelllaboratoriesfsm.features.damageProduct.model.DamageProductResponseModel
import com.powelllaboratoriesfsm.features.damageProduct.model.delBreakageReq
import com.powelllaboratoriesfsm.features.damageProduct.model.viewAllBreakageReq
import com.powelllaboratoriesfsm.features.login.model.userconfig.UserConfigResponseModel
import com.powelllaboratoriesfsm.features.myjobs.model.WIPImageSubmit
import com.powelllaboratoriesfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}