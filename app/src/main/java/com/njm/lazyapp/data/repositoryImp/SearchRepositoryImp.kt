package com.njm.lazyapp.data.repositoryImp

import android.content.Context
import com.njm.lazyapp.data.service.remote.YoutubeApiService
import com.njm.lazyapp.domain.model.ResultBySearchModel
import com.njm.lazyapp.domain.repository.SearchRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class SearchRepositoryImp @Inject constructor(private val youtubeApiService: YoutubeApiService): SearchRepository{

    override fun getVideoBySearch(part: String, order: String, q: String, key: String): Single<ResultBySearchModel> {
        return youtubeApiService.getVideoBySearch(part, order, q, key)
    }


}