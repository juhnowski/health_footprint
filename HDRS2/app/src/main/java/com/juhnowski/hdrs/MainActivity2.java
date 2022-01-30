package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_2 = "com.juhnowski.hdrs.MESSAGE_2";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_1);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity3.class);

        CheckBox c2_1 = (CheckBox) findViewById(R.id.c2_1);
        CheckBox c2_2 = (CheckBox) findViewById(R.id.c2_2);
        CheckBox c2_3 = (CheckBox) findViewById(R.id.c2_3);
        CheckBox c2_4 = (CheckBox) findViewById(R.id.c2_4);
        CheckBox c2_5 = (CheckBox) findViewById(R.id.c2_5);

        if (c2_1.isChecked()) res=1;
        if (c2_2.isChecked()) res=2;
        if (c2_3.isChecked()) res=3;
        if (c2_4.isChecked() || c2_5.isChecked()) res=4;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_2, msg);
        startActivity(intent);
    }

}