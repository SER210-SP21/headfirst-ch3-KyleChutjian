package com.example.intents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {


        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            String result = data.getStringExtra("returnKey");
            if (result != null && result.length() >= 0) {
                Toast.makeText(this,result,Toast.LENGTH_LONG).show();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void onClick(View view) {
        EditText text = (EditText) findViewById(R.id.inputforintent);
        String value = text.getText().toString();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("inputKey",value);
        startActivityForResult(intent,REQUEST_CODE);
    }

    public void pickImage(View view) {
    }
}