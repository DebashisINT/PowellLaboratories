package com.powelllaboratoriesfsm.features.document.api

import com.powelllaboratoriesfsm.features.dymanicSection.api.DynamicApi
import com.powelllaboratoriesfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}