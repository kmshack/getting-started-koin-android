package org.koin.sample.view.viewmodel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import fr.ekito.myweatherapp.R
import kotlinx.android.synthetic.main.activity_simple.*
import org.koin.android.scope.currentScope

class MyViewModelActivity : AppCompatActivity() {

    // Lazy Inject ViewModel
    val myViewModel: MyViewModel by currentScope.inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        title = "MyViewModelActivity"
        text.text = myViewModel.repositoryHash()

    }
}
