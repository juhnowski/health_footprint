package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity6 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_6 = "com.juhnowski.hdrs.MESSAGE_6";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity5.EXTRA_MESSAGE_5);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity7.class);

        CheckBox c6_1 = (CheckBox) findViewById(R.id.c6_1);
        CheckBox c6_2 = (CheckBox) findViewById(R.id.c6_2);

        if (c6_1.isChecked()) res=1;
        if (c6_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_6, msg);
        startActivity(intent);
    }
}