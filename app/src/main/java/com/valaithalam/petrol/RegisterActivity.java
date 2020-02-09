package com.valaithalam.petrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String [] Districs = { "Ariyalur", "Chengalpattu", "Chennai", "Coimbatore",
            "Cuddalore","Dharmapuri","Dindigul", "Erode", "Kallakurichi", "Kanchipuram","Kanniyakumari", "Karur", "Krishnagiri",
            "Madurai", "Nagapattinam", "Namakkal", "Nilgiris", "Perambalur", "Pudukkottai", "Ramanathapuram", "Ranipet", "Salem", "Sivagangai", "Tenkasi", "Thanjavur",
            "Theni", "Thoothukudi", "Tiruchirappalli", "Tirunelveli", "Tirupattur", "Tiruppur", "Tiruvallur" , "Tiruvannamalai", "Tiruvarur" , "Vellore", "Viluppuram", "Virudhunagar" };

    Spinner dis_spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dis_spin = findViewById(R.id.dis_spinner);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Districs);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dis_spin.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void create(View view) {
        Intent i = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(i);
    }
}
