package org.koin.sample.view.scope

import org.koin.sample.HelloRepository


class MyScopePresenter(val repo: HelloRepository) {


    fun sayHello() = "${repo.giveHello()} from $this"
}