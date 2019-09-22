package org.koin.sample

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.koin.sample.view.viewmodel.MyViewModel
import org.koin.sample.view.viewmodel.MyViewModelActivity
import org.koin.sample.view.viewmodel.UseCaseA
import org.koin.sample.view.viewmodel.UseCaseB

val appModule = module {

    // single instance of HelloRepository
    factory<HelloRepository> { HelloRepositoryImpl() }

    scope(named<MyViewModelActivity>()) {
        // scoped MyScopePresenter instance
        scoped<HelloRepository> { HelloRepositoryImpl() }
    }

    factory { UseCaseA(get()) }
    factory { UseCaseB(get()) }

    // MyViewModel ViewModel
    viewModel { MyViewModel(get(), get()) }
}