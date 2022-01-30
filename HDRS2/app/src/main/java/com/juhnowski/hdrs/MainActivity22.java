package com.juhnowski.hdrs;

import static com.juhnowski.hdrs.MainActivity21.EXTRA_MESSAGE_21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity22 extends AppCompatActivity {
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        Intent intent = getIntent();
        message = intent.getStringExtra(EXTRA_MESSAGE_21);

        List<String> list = Arrays.asList(message.split(";"));
        TextView result = (TextView) findViewById(R.id.result);
        List<Integer> w = Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
        Hdrs hdrs = new Hdrs(w);
        result.setText(hdrs.summator(list));

    }

    public void sendMessage(View view) {
        this.finishAffinity();
    }
}