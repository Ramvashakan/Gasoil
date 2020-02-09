package com.valaithalam.petrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText user_email,user_pass;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user_email = findViewById(R.id.usr_email);
        user_pass = findViewById(R.id.usr_pass);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ServiceActivity.class);
                startActivity(i);
            }
        });

    }




    public void register(View view) {

        Intent i = new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(i);
    }
}
