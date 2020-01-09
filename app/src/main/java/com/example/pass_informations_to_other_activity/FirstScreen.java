package com.example.pass_informations_to_other_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstScreen extends AppCompatActivity {

    EditText txt1;
    Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        bt1 = findViewById(R.id.bt1);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstScreen.this, SecondScreen.class);
                intent.putExtra("myValue", txt1.getText().toString());
                startActivity(intent);
            }
        });

    }
}
