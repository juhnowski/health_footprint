package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity10 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_10 = "com.juhnowski.hdrs.MESSAGE_10";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity9.EXTRA_MESSAGE_9);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity11.class);

        CheckBox c10_1 = (CheckBox) findViewById(R.id.c10_1);
        CheckBox c10_2 = (CheckBox) findViewById(R.id.c10_2);
        CheckBox c10_3 = (CheckBox) findViewById(R.id.c10_3);
        CheckBox c10_4 = (CheckBox) findViewById(R.id.c10_4);

        if (c10_1.isChecked()) res=1;
        if (c10_2.isChecked()) res=2;
        if (c10_3.isChecked()) res=3;
        if (c10_4.isChecked()) res=4;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_10, msg);
        startActivity(intent);
    }
}