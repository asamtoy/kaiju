package com.example.andrewsamtoy.kaiju;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public abstract class Vehicle {

    String type;
    int armor;

    public Vehicle(String type, int armor){
        this.type = type;
        this.armor = armor;
    }
}
