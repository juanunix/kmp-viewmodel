package org.juansanz.viewmodel.di

import MainViewModel
import JVMPlatform
import Platform
import org.koin.dsl.module
import org.koin.core.module.dsl.singleOf

actual val platformModule = module {
    single<Platform> { JVMPlatform() }

    singleOf(::MainViewModel)
}