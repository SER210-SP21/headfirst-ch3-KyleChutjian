package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    public void finish() {


        EditText returnValue = (EditText) findViewById(R.id.returnValue);
        Intent data = new Intent(this,MainActivity.class);
        data.putExtra("returnKey",returnValue.getText().toString());
        setResult(RESULT_OK,data);
        super.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String value = getIntent().getStringExtra("inputKey");
        TextView returnValue = (TextView) findViewById(R.id.displayintentextra);
        returnValue.setText(value);



    }
}