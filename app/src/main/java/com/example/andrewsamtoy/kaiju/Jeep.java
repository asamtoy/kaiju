package com.example.andrewsamtoy.kaiju;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public class Jeep
    extends Vehicle {
    public Jeep() {
        super("Jeep", 50, 5);
    }
    public String getType(){
        return type;
    }

    public int getArmor() {
        return armor;
    }
}
