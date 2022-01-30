package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity13 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_13 = "com.juhnowski.hdrs.MESSAGE_13";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity12.EXTRA_MESSAGE_12);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity14.class);

        CheckBox c13_1 = (CheckBox) findViewById(R.id.c13_1);
        CheckBox c13_2 = (CheckBox) findViewById(R.id.c13_2);

        if (c13_1.isChecked()) res=1;
        if (c13_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_13, msg);
        startActivity(intent);
    }
}