package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity21 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_21 = "com.juhnowski.hdrs.MESSAGE_21";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity20.EXTRA_MESSAGE_20);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity22.class);

        CheckBox c21_1 = (CheckBox) findViewById(R.id.c21_1);
        CheckBox c21_2 = (CheckBox) findViewById(R.id.c21_2);

        if (c21_1.isChecked()) res=1;
        if (c21_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_21, msg);
        startActivity(intent);
    }
}