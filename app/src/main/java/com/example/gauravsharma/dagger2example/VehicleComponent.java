package com.example.gauravsharma.dagger2example;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by gauravsharma on 16/01/18.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
