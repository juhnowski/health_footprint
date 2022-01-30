package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_1 = "com.juhnowski.hdrs.MESSAGE_1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        int res = 1;
        Intent intent = new Intent(this, MainActivity2.class);

        CheckBox c1_1 = (CheckBox) findViewById(R.id.c1_1);
        CheckBox c1_2 = (CheckBox) findViewById(R.id.c1_2);
        CheckBox c1_3 = (CheckBox) findViewById(R.id.c1_3);
        CheckBox c1_4 = (CheckBox) findViewById(R.id.c1_4);
        CheckBox c1_5 = (CheckBox) findViewById(R.id.c1_5);

        if (c1_3.isChecked()) res=2;
        if (c1_4.isChecked()) res=3;
        if (c1_5.isChecked()) res=4;

        String message = ""+res+";";
        intent.putExtra(EXTRA_MESSAGE_1, message);
        startActivity(intent);
    }
}