package com.njm.lazyapp.domain.repository

import com.njm.lazyapp.domain.model.ResultBySearchModel
import io.reactivex.rxjava3.core.Single


interface SearchRepository{

    fun getVideoBySearch(part: String, order: String, q: String, key: String): Single<ResultBySearchModel>
}