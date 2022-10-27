package com.powelllaboratoriesfsm.features.survey.api

import com.powelllaboratoriesfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.powelllaboratoriesfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}