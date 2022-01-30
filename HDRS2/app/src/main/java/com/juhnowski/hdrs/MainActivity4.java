package com.juhnowski.hdrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity4 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_4 = "com.juhnowski.hdrs.MESSAGE_4";
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity3.EXTRA_MESSAGE_3);
    }

    public void sendMessage(View view) {
        int res = 0;
        Intent intent = new Intent(this, MainActivity5.class);

        CheckBox c4_1 = (CheckBox) findViewById(R.id.c4_1);
        CheckBox c4_2 = (CheckBox) findViewById(R.id.c4_2);
        CheckBox c4_3 = (CheckBox) findViewById(R.id.c4_3);

        if (c4_1.isChecked()) res=1;
        if (c4_2.isChecked()) res=2;
        if (c4_3.isChecked()) res=2;

        String msg = message+""+res+";";
        intent.putExtra(EXTRA_MESSAGE_4, msg);
        startActivity(intent);
    }
}