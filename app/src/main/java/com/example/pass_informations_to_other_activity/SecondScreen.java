package com.example.pass_informations_to_other_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    TextView txtView1;
    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        txtView1 = findViewById(R.id.txtView1);
        bt2 = findViewById(R.id.bt2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        txtView1.setText(bundle.get("myValue").toString());

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( SecondScreen.this, FirstScreen.class);

                startActivity(intent);
            }
        });
    }
}
