package com.example.dagger.hilt.di.module

import com.example.dagger.hilt.FooDataSource
import com.example.dagger.hilt.FooRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent


@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindFooDataSource(repository: FooRepository): FooDataSource
}