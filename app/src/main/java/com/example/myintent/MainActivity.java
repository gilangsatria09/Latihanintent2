package com.example.myintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login =(Button)findViewById(R.id.tombol_login);
        login.setOnClickListener(this);
        register = (Button)findViewById(R.id.tombol_register);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tombol_register:
                Intent register =new Intent(MainActivity.this,IntentRegister.class);
                startActivity(register);
                break;
            case R.id.tombol_login:
                Intent login = new Intent(MainActivity.this,IntentHome.class);
                startActivity(login);
                break;
        }

    }
}
