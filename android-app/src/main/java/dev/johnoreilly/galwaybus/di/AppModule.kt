package dev.johnoreilly.galwaybus.di

import dev.johnoreilly.galwaybus.ui.viewmodel.GalwayBusViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val galwayBusAppModule = module {
    viewModel { GalwayBusViewModel(get(), get(),get()) }
}


// Gather all app modules
val appModule = listOf(galwayBusAppModule)