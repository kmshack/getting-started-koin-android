package org.koin.sample.view.viewmodel

import org.koin.sample.HelloRepository

class UseCaseB(val repo: HelloRepository){

    operator fun invoke(): String{
        return "UseCaseB > ${repo.hashCode()}"
    }

}