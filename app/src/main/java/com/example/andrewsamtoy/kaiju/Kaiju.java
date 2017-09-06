package com.example.andrewsamtoy.kaiju;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public abstract class Kaiju {

    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public abstract String roar();
}
