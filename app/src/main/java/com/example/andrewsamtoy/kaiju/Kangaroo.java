package com.example.andrewsamtoy.kaiju;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public class Kangaroo
    extends Kaiju {

    public Kangaroo(){
        super("Kangaroo", 1000, 100);
    }

    public String getName() {
        return name;
    }

    public int getHealthValue(){
        return healthValue;
    }

    public int getAttackValue(){
        return attackValue;
    }

    @Override
    public String roar() {
        return "BOUNCE";
    }
}
