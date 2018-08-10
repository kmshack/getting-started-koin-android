package org.koin.sample

import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import org.koin.sample.view.java.MyJavaPresenter
import org.koin.sample.view.scope.MyScopePresenter
import org.koin.sample.view.simple.MySimplePresenter
import org.koin.sample.view.viewmodel.MyViewModel

val appModule = module {

    // single instance of HelloRepository
    single { HelloRepositoryImpl() as HelloRepository }

    // Simple Presenter Factory
    factory { MySimplePresenter(get()) }

    // Simple Java Presenter
    factory { MyJavaPresenter(get()) }

    // Module bound with MyScopeActivity lifecycle
    module("ScopedView") {
        single { MyScopePresenter(get()) }
    }

    // MyViewModel ViewModel
    viewModel { MyViewModel(get()) }
}