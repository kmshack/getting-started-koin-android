package org.koin.sample.view.simple

import org.koin.sample.HelloRepository


class MySimplePresenter(val repo: HelloRepository) {


    fun sayHello() = "${repo.giveHello()} from $this"
}