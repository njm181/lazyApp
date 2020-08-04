package com.njm.lazyapp.data.service.remote

import com.njm.lazyapp.domain.model.ResultBySearchModel
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface YoutubeApiService {

    @GET("search")
    fun getVideoBySearch(@Query("part") part:String,
                         @Query("order") order: String,
                         @Query("q") q: String,
                         @Query("key") key: String): Single<ResultBySearchModel>
}