package com.example.student1.anew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView question, result;
    EditText input_name;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question = (TextView)findViewById(R.id.question);
        result = (TextView)findViewById(R.id.result);
        input_name = (EditText)findViewById(R.id.input_name);
        button = (Button)findViewById(R.id.button);
    }

    public void result(View view) {
        String name = input_name.getText().toString();
        result.setText("Hello, " + name);
        result.setVisibility(View.VISIBLE);
        button.setVisibility(View.GONE);
        question.setVisibility(View.GONE);
        input_name.setVisibility(View.GONE);
    }
}
