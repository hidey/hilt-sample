package com.example.dagger.hilt.di.module

import com.example.dagger.hilt.di.qualifier.HttpClientForApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit


@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {
    // OkHttpClientはこんな感じ
    // HttpClientForApi をつけると
    // https://developer.android.com/training/dependency-injection/hilt-android
    @HttpClientForApi
    @Provides
    fun provideOkHttpClient(
    ): OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(1, TimeUnit.MINUTES)
        .readTimeout(1, TimeUnit.MINUTES)
        .writeTimeout(1, TimeUnit.MINUTES)
        .build()

}