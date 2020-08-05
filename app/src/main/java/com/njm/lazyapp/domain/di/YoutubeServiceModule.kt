package com.njm.lazyapp.domain.di

import android.content.Context
import com.njm.lazyapp.data.repositoryImp.SearchRepositoryImp
import com.njm.lazyapp.data.service.remote.YoutubeApiService
import com.njm.lazyapp.domain.repository.SearchRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class YoutubeServiceModule {

    @Binds
    abstract fun bindSearchImp(searchRepositoryImp: SearchRepositoryImp): SearchRepository
}