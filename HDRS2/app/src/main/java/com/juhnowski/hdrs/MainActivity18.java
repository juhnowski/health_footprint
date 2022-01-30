package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity18 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_18 = "com.juhnowski.hdrs.MESSAGE_18";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity17.EXTRA_MESSAGE_17);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity19.class);

        CheckBox c18_1 = (CheckBox) findViewById(R.id.c18_1);
        CheckBox c18_2 = (CheckBox) findViewById(R.id.c18_2);

        if (c18_1.isChecked()) res=1;
        if (c18_2.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_18, msg);
        startActivity(intent);
    }
}