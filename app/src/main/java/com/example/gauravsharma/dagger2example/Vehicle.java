package com.example.gauravsharma.dagger2example;

import javax.inject.Inject;

/**
 * Created by gauravsharma on 16/01/18.
 */

public class Vehicle {
    private Motor motor;

    @Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}
