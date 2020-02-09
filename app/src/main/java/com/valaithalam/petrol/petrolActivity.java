package com.valaithalam.petrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class petrolActivity extends FragmentActivity implements OnMapReadyCallback, AdapterView.OnItemSelectedListener {

    Button pun_submit;
    GoogleMap map;
    Spinner spinner;
    String[] GasOil = {"Petrol", "Diesel", "Speed Petrol"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petrol);

        pun_submit = findViewById(R.id.oil_submit);

        spinner = findViewById(R.id.spinner_oil);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, GasOil);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_pet);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;

        LatLng Madurai = new LatLng(9.881376, 78.029283);
        map.addMarker(new MarkerOptions().position(Madurai).title("HighWay"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Madurai));

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            Toast.makeText(getApplicationContext(), GasOil[position], Toast.LENGTH_SHORT).show();



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void success(View view) {

        Toast.makeText(getApplication(), "Form Send Successfully", Toast.LENGTH_LONG).show();
    }
}