package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity8 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_8 = "com.juhnowski.hdrs.MESSAGE_8";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity7.EXTRA_MESSAGE_7);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity9.class);

        CheckBox c8_1 = (CheckBox) findViewById(R.id.c8_1);
        CheckBox c8_2 = (CheckBox) findViewById(R.id.c8_2);
        CheckBox c8_3 = (CheckBox) findViewById(R.id.c8_3);

        if (c8_1.isChecked()) res=1;
        if (c8_2.isChecked()) res=2;
        if (c8_3.isChecked()) res=3;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_8, msg);
        startActivity(intent);
    }
}