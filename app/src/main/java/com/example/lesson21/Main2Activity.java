package com.example.lesson21;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Intent intent;
    private String message;
    private TextView _tvMessage;
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";
    private EditText _etReply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        _etReply = findViewById(R.id.editText_second);
        _tvMessage = findViewById(R.id.text_message);
        _tvMessage.setText(message);
    }

    public void returnReply(View view) {
        String reply = _etReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
