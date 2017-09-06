package com.example.andrewsamtoy.kaiju;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public class Cat 
    extends Kaiju {

    public Cat() {
        super("Cat", 10, 1);
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue(){
        return attackValue;
    }

    @Override
    public String roar() {
        return "Meow";
    }

    @Override
    public String move() {
        return "The cat finds the warm sunny patch.";
    }


}
