package com.njm.lazyapp.presentation.viewModel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.njm.lazyapp.domain.model.ResultBySearchModel
import com.njm.lazyapp.domain.usesCases.search.GetSearchUseCase

class SearchViewModel @ViewModelInject constructor(private val getSearchUseCase: GetSearchUseCase): ViewModel(){

    var searchMutableLiveData: MutableLiveData<ResultBySearchModel> = MutableLiveData()

    fun searchVideosResponse(): MutableLiveData<ResultBySearchModel>{
        return searchMutableLiveData
    }

    fun getSearchUseCase(consulta: String){
        getSearchUseCase.getSearch(consulta)
        getSearchUseCase.execute(
            onSuccess = {
                Log.d("response", "Respuesta del servidor")
            },
            onError = {
                Log.d("Failure", "Fallo la consulta")
            }
        )
    }
}