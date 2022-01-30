package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity11 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_11 = "com.juhnowski.hdrs.MESSAGE_11";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity10.EXTRA_MESSAGE_10);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity12.class);

        CheckBox c11_1 = (CheckBox) findViewById(R.id.c11_1);
        CheckBox c11_2 = (CheckBox) findViewById(R.id.c11_2);

        if (c11_1.isChecked()) res=1;
        if (c11_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_11, msg);
        startActivity(intent);
    }
}