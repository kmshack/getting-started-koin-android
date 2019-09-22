package org.koin.sample.view.viewmodel

import android.arch.lifecycle.ViewModel
import org.koin.sample.HelloRepository

class MyViewModel(val useCaseA: UseCaseA,
                  val useCaseB: UseCaseB) : ViewModel() {

    fun repositoryHash() = "${useCaseA()}\n${useCaseB()}"
}