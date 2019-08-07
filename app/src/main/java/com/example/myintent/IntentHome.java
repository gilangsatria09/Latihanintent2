package com.example.myintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IntentHome extends AppCompatActivity implements View.OnClickListener {
    Button btnweb;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btnweb = (Button) findViewById(R.id.btnWeb);
        btnweb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnWeb:
                Intent btnweb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.accuweather.com"));
                startActivity(btnweb);
                break;
        }
    }
}
