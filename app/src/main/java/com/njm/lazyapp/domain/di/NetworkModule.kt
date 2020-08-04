package com.njm.lazyapp.domain.di

import com.njm.lazyapp.data.service.remote.YoutubeApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun gsonConverterFactoryProvider(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Provides
    @Singleton
    fun httpLogginInteceptorProvider(): HttpLoggingInterceptor{
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    @Singleton
    fun okHttpClientProvider(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient{
        return OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
    }

    @Provides
    @Singleton
    fun retrofitProvider(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory, rxJavaCallAdapterFactory: RxJavaCallAdapterFactory):Retrofit{
        return Retrofit.Builder()
            .baseUrl("url constante")
            .addConverterFactory(gsonConverterFactory)
            .addCallAdapterFactory(rxJavaCallAdapterFactory)
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun youtubeApiServiceProvider(retrofit: Retrofit):YoutubeApiService{
        return retrofit.create(YoutubeApiService::class.java)
    }
}