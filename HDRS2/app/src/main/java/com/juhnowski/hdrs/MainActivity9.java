package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity9 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_9 = "com.juhnowski.hdrs.MESSAGE_9";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity8.EXTRA_MESSAGE_8);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity10.class);

        CheckBox c9_1 = (CheckBox) findViewById(R.id.c9_1);
        CheckBox c9_2 = (CheckBox) findViewById(R.id.c9_2);

        if (c9_1.isChecked()) res=1;
        if (c9_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_9, msg);
        startActivity(intent);
    }
}