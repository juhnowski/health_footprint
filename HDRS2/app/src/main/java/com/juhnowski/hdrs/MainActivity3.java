package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity3 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_3 = "com.juhnowski.hdrs.MESSAGE_3";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity2.EXTRA_MESSAGE_2);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity4.class);

        CheckBox c3_1 = (CheckBox) findViewById(R.id.c3_1);
        CheckBox c3_2 = (CheckBox) findViewById(R.id.c3_2);
        CheckBox c3_3 = (CheckBox) findViewById(R.id.c3_3);
        CheckBox c3_4 = (CheckBox) findViewById(R.id.c3_4);

        if (c3_1.isChecked()) res=1;
        if (c3_2.isChecked()) res=2;
        if (c3_3.isChecked()) res=3;
        if (c3_4.isChecked()) res=4;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_3, msg);
        startActivity(intent);
    }
}