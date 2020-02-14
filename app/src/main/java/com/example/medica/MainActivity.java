package com.example.medica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.join) {

            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        }
    }

    private void initView() {
        join = (Button) findViewById(R.id.join);
        join.setOnClickListener(MainActivity.this);
    }
}
