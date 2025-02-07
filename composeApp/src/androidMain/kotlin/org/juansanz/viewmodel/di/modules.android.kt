package org.juansanz.viewmodel.di

import MainViewModel
import Platform
import org.juansanz.viewmodel.AndroidPlatform
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

actual val platformModule = module {
    single<Platform> { AndroidPlatform() }

    viewModelOf(::MainViewModel)
}