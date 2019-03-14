package com.example.week5day3app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etProductName;
    EditText etProductIDNumber;
    EditText etProductInventoryCount;
    EditText etProductDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etProductName = findViewById(R.id.etProductName);
        etProductIDNumber = findViewById(R.id.etProductIDNumber);
        etProductInventoryCount = findViewById(R.id.etProductInventoryCount);
        etProductDescription = findViewById(R.id.etProductDescription);


    }

    public void onClick(View view) {
        String input = etProductName.getText().toString();
        if (input != null) {
           // Intent intent = new Intent(SEND_BROADCAST);
           // intent.putExtra("message", userinput);
           // sendBroadcast(intent,"my.permission");
        }

    }
}
