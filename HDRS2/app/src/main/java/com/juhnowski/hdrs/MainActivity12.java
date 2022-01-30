package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity12 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_12 = "com.juhnowski.hdrs.MESSAGE_12";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity11.EXTRA_MESSAGE_11);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity13.class);

        CheckBox c12_1 = (CheckBox) findViewById(R.id.c12_1);
        CheckBox c12_2 = (CheckBox) findViewById(R.id.c12_2);

        if (c12_1.isChecked()) res=1;
        if (c12_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_12, msg);
        startActivity(intent);
    }
}