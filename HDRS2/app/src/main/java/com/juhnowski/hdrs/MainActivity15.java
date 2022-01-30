package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity15 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_15 = "com.juhnowski.hdrs.MESSAGE_15";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity14.EXTRA_MESSAGE_14);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity16.class);

        CheckBox c15_1 = (CheckBox) findViewById(R.id.c15_1);
        CheckBox c15_2 = (CheckBox) findViewById(R.id.c15_2);
        CheckBox c15_3 = (CheckBox) findViewById(R.id.c15_3);
        CheckBox c15_4 = (CheckBox) findViewById(R.id.c15_4);

        if (c15_1.isChecked()) res=1;
        if (c15_2.isChecked()) res=2;
        if (c15_1.isChecked()) res=3;
        if (c15_2.isChecked()) res=4;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_15, msg);
        startActivity(intent);
    }
}