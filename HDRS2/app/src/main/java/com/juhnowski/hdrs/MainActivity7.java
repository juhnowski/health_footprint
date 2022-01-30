package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity7 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_7 = "com.juhnowski.hdrs.MESSAGE_7";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity6.EXTRA_MESSAGE_6);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity8.class);

        CheckBox c7_1 = (CheckBox) findViewById(R.id.c7_1);
        CheckBox c7_2 = (CheckBox) findViewById(R.id.c7_2);
        CheckBox c7_3 = (CheckBox) findViewById(R.id.c7_3);
        CheckBox c7_4 = (CheckBox) findViewById(R.id.c7_4);

        if (c7_1.isChecked()) res=1;
        if (c7_2.isChecked()) res=2;
        if (c7_3.isChecked()) res=3;
        if (c7_4.isChecked()) res=4;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_7, msg);
        startActivity(intent);
    }
}