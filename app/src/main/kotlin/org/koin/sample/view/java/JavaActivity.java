package org.koin.sample.view.java;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.koin.java.standalone.KoinJavaComponent;
import org.koin.sample.view.simple.MySimpleActivity;
import org.koin.sample.view.simple.MySimplePresenter;

import fr.ekito.myweatherapp.R;
import kotlin.Lazy;

public class JavaActivity extends AppCompatActivity {

    private Lazy<MySimplePresenter> presenter = KoinJavaComponent.inject(MySimplePresenter.class);
    private Lazy<MyJavaPresenter> javaPresenter = KoinJavaComponent.inject(MyJavaPresenter.class);

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        setTitle("MyJavaActivity");

        TextView text = findViewById(R.id.text);
        ConstraintLayout background = findViewById(R.id.background);

        text.setText(presenter.getValue().sayHello()+"\n"+javaPresenter.getValue().sayHello());

        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), MySimpleActivity.class));
            }
        });
    }
}
