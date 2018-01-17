package com.example.gauravsharma.dagger2example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gaurav sharma on 16/01/18.
 */
@Module
public class VehicleModule {

    @Provides
    @Singleton
    public Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    public Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
