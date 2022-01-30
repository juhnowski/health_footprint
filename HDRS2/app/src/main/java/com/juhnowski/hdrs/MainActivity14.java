package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity14 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_14 = "com.juhnowski.hdrs.MESSAGE_14";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity13.EXTRA_MESSAGE_13);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity15.class);

        CheckBox c14_1 = (CheckBox) findViewById(R.id.c14_1);
        CheckBox c14_2 = (CheckBox) findViewById(R.id.c14_2);

        if (c14_1.isChecked()) res=1;
        if (c14_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_14, msg);
        startActivity(intent);
    }
}