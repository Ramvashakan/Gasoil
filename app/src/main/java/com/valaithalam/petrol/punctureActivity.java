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

public class punctureActivity extends FragmentActivity implements OnMapReadyCallback, AdapterView.OnItemSelectedListener {

    Button pun_submit;
    GoogleMap map;
    Spinner spinner;
    String [] Vehicle = { "Bikes", "Car", "Lorry" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puncture);

        pun_submit = findViewById(R.id.pun_submit);

        spinner = findViewById(R.id.sip_vehicle);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Vehicle );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
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
        Toast.makeText(getApplicationContext(),Vehicle[position] , Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void success(View view) {

        Toast.makeText(getApplication(),"Form Send Successfully", Toast.LENGTH_LONG).show();
    }
}
