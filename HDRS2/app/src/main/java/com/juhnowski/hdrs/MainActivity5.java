package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity5 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_5 = "com.juhnowski.hdrs.MESSAGE_5";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity4.EXTRA_MESSAGE_4);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity6.class);

        CheckBox c5_1 = (CheckBox) findViewById(R.id.c5_1);
        CheckBox c5_2 = (CheckBox) findViewById(R.id.c5_2);

        if (c5_1.isChecked()) res=1;
        if (c5_2.isChecked()) res=2;


        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_5, msg);
        startActivity(intent);
    }
}