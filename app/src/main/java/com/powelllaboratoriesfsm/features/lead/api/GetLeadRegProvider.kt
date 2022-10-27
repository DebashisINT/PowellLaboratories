package com.powelllaboratoriesfsm.features.lead.api

import com.powelllaboratoriesfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.powelllaboratoriesfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}