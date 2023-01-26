package com.ibrahim.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button showNameButton;
    private TextView showText;
    private EditText editableText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showNameButton = findViewById(R.id.button);
        showText = findViewById(R.id.textView);
        editableText = findViewById(R.id.editText);


        editableText.setOnFocusChangeListener((view, id)->{
            System.out.println(view);
            String name = editableText.getText().toString();
            if(name.isEmpty())
                showText.setText("");
            else
                showText.setText("Hello, "+ name);
        });
    }
}