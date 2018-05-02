package com.pearlmaknun.qrcode;

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

        String data = getIntent().getExtras().getString("keyName","defaultKey");

        tvdisplay.setText(data);

    }
}
