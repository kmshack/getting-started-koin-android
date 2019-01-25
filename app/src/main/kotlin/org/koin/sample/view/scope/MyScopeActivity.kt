package org.koin.sample.view.scope

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import fr.ekito.myweatherapp.R
import kotlinx.android.synthetic.main.activity_simple.*
import org.koin.android.scope.bindScope
import org.koin.android.scope.getActivityScope
import org.koin.sample.view.viewmodel.MyViewModelActivity

class MyScopeActivity : AppCompatActivity() {

    // lazy injected MyScopePresenter
    val presenter: MyScopePresenter by getActivityScope().inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        bindScope(getActivityScope())

        println("presenter -> $presenter")

        title = "MyScopeActivity"
        text.text = presenter.sayHello()

        background.setOnClickListener { _ ->
            startActivity(Intent(this, MyViewModelActivity::class.java))
        }
    }
}
