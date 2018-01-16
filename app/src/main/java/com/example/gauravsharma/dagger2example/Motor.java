package com.example.gauravsharma.dagger2example;

/**
 * Created by gauravsharma on 16/01/18.
 */

public class Motor {
    private int rpm;

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return this.rpm;
    }

    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake() {
        this.rpm = 0;
    }
}
