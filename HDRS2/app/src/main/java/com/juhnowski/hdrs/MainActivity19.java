package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity19 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_19 = "com.juhnowski.hdrs.MESSAGE_19";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity18.EXTRA_MESSAGE_18);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity20.class);

        CheckBox c19_1 = (CheckBox) findViewById(R.id.c19_1);
        CheckBox c19_2 = (CheckBox) findViewById(R.id.c19_2);
        CheckBox c19_3 = (CheckBox) findViewById(R.id.c19_3);
        CheckBox c19_4 = (CheckBox) findViewById(R.id.c19_4);

        if (c19_1.isChecked()) res=1;
        if (c19_2.isChecked()) res=2;
        if (c19_3.isChecked()) res=3;
        if (c19_4.isChecked()) res=4;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_19, msg);
        startActivity(intent);
    }
}