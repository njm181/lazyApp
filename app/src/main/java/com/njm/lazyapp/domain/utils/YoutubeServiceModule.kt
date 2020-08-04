package com.njm.lazyapp.domain.utils

import android.content.Context
import com.njm.lazyapp.data.repositoryImp.SearchRepositoryImp
import com.njm.lazyapp.data.service.remote.YoutubeApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class YoutubeServiceModule {

    @Provides
    @Singleton
    fun serarchRepositoryImpProvider(@Named("application.context") context: Context, youtubeApiService: YoutubeApiService): SearchRepositoryImp{
        return SearchRepositoryImp(context, youtubeApiService)

    }
}