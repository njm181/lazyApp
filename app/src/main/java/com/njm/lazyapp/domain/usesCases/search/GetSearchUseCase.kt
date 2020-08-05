package com.njm.lazyapp.domain.usesCases.search

import com.njm.lazyapp.data.repositoryImp.SearchRepositoryImp
import com.njm.lazyapp.domain.model.ResultBySearchModel
import com.njm.lazyapp.domain.repository.SearchRepository
import com.njm.lazyapp.domain.usesCases.base.SingleUseCase
import com.njm.lazyapp.domain.utils.KEY
import com.njm.lazyapp.domain.utils.ORDER
import com.njm.lazyapp.domain.utils.PART
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GetSearchUseCase @Inject constructor(private val searchRepositoryImp: SearchRepositoryImp): SingleUseCase<ResultBySearchModel>() {

    private lateinit var consulta: String

    fun getSearch(consulta: String){
        this.consulta = consulta
    }


    override fun buildUseCaseSingle(): Single<ResultBySearchModel> {
        return searchRepositoryImp.getVideoBySearch(PART, ORDER, consulta, KEY)
    }
}