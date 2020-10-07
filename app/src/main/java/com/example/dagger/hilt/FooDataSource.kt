package com.example.dagger.hilt

import javax.inject.Inject

interface FooDataSource {
    fun getData(): String
}

class FooRepository @Inject constructor() : FooDataSource {
    override fun getData(): String = "data"
}