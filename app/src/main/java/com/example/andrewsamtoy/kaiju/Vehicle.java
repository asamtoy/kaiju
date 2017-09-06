package com.example.andrewsamtoy.kaiju;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public abstract class Vehicle {

    String type;
    int healthValue;

    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }
}
