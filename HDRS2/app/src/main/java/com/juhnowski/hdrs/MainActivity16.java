package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity16 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_16 = "com.juhnowski.hdrs.MESSAGE_16";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity15.EXTRA_MESSAGE_15);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity17.class);

        CheckBox c16_1 = (CheckBox) findViewById(R.id.c16_1);
        CheckBox c16_2 = (CheckBox) findViewById(R.id.c16_2);

        if (c16_1.isChecked()) res=1;
        if (c16_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_16, msg);
        startActivity(intent);
    }
}