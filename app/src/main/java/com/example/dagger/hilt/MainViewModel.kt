package com.example.dagger.hilt

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.dagger.hilt.di.qualifier.HttpClientForApi
import com.example.dagger.hilt.di.qualifier.HttpClientForOtherSite
import okhttp3.OkHttpClient

class MainViewModel @ViewModelInject constructor(
    @HttpClientForApi private val okHttpClient: OkHttpClient,
    @HttpClientForOtherSite private val okHttpClient2: OkHttpClient,
    private val repository: FooDataSource,
    @Assisted private val savedState: SavedStateHandle
) : ViewModel() {

}
