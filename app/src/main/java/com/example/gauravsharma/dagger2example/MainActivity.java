package com.example.gauravsharma.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {

    private Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent vehicleComponent;
    }
}
