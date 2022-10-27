package com.powelllaboratoriesfsm.features.activities.api

import com.powelllaboratoriesfsm.features.member.api.TeamApi
import com.powelllaboratoriesfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}