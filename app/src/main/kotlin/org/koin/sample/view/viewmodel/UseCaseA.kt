package org.koin.sample.view.viewmodel

import org.koin.sample.HelloRepository

class UseCaseA(val repo: HelloRepository){

    operator fun invoke(): String{
        return "UseCaseA > ${repo.hashCode()}"
    }

}