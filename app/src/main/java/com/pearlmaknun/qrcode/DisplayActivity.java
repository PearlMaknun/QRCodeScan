package com.pearlmaknun.qrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView tvdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvdisplay = findViewById(R.id.tv_display);
        Intent i = getIntent();

        String Data = i.getStringExtra("data");

        tvdisplay.setText(Data);

    }
}
