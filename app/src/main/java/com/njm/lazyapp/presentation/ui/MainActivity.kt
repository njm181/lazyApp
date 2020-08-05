package com.njm.lazyapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.njm.lazyapp.R
import com.njm.lazyapp.presentation.viewModel.SearchViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)

        searchViewModel.getSearchUseCase("futbol")
        searchViewModel.searchVideosResponse().observe(this, Observer {
            it.hashCode()
        })

    }
}