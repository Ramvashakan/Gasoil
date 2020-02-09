package com.valaithalam.petrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceActivity extends AppCompatActivity {


    Button punchure,petrol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        punchure = findViewById(R.id.puncture);
        petrol = findViewById(R.id.petrol);
        punchure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServiceActivity.this, punctureActivity.class);
                startActivity(i);

            }
        });
        petrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServiceActivity.this,petrolActivity.class);
                startActivity(i);
            }
        });
    }
}
