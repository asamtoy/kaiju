package com.example.andrewsamtoy.kaiju;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public class Hummer
    extends Vehicle {
    public Hummer() {
        super("Hummer", 300);
    }
    public String getType(){
        return type;
    }

    public int getArmor(){
        return armor;
    }
}
