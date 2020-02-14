package com.example.medica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    protected EditText usernameEdt;
    protected EditText passwordEdt;
    protected Button signIn;
    protected TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_login);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.signIn) {

        } else if (view.getId() == R.id.register) {

            startActivity(new Intent(LoginActivity.this,RegisterActivity.class));

        }
    }

    private void initView() {
        usernameEdt = (EditText) findViewById(R.id.username_edt);
        passwordEdt = (EditText) findViewById(R.id.password_edt);
        signIn = (Button) findViewById(R.id.signIn);
        signIn.setOnClickListener(LoginActivity.this);
        register = (TextView) findViewById(R.id.register);
        register.setOnClickListener(LoginActivity.this);
    }
}
