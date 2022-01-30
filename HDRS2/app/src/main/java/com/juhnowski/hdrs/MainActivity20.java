package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity20 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_20 = "com.juhnowski.hdrs.MESSAGE_20";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity19.EXTRA_MESSAGE_19);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity21.class);

        CheckBox c20_1 = (CheckBox) findViewById(R.id.c20_1);
        CheckBox c20_2 = (CheckBox) findViewById(R.id.c20_2);
        CheckBox c20_3 = (CheckBox) findViewById(R.id.c20_3);
        CheckBox c20_4 = (CheckBox) findViewById(R.id.c20_4);

        if (c20_1.isChecked()) res=1;
        if (c20_2.isChecked()) res=2;
        if (c20_3.isChecked()) res=3;
        if (c20_4.isChecked()) res=4;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_20, msg);
        startActivity(intent);
    }
}