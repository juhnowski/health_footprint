package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity17 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_17 = "com.juhnowski.hdrs.MESSAGE_17";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity16.EXTRA_MESSAGE_16);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity18.class);

        CheckBox c17_1 = (CheckBox) findViewById(R.id.c17_1);
        CheckBox c17_2 = (CheckBox) findViewById(R.id.c17_2);

        if (c17_1.isChecked()) res=1;
        if (c17_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_17, msg);
        startActivity(intent);
    }
}