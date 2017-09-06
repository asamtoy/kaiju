package com.example.andrewsamtoy.kaiju;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public abstract class Vehicle implements Damageable {

    String type;
    int armor;
    int attackValue;

    public Vehicle(String type, int armor, int attackValue){
        this.type = type;
        this.armor = armor;
        this.attackValue = attackValue;
    }

    public int getAttackValue(){
        return this.attackValue;
    }

    public void damage(int attackValue) {
        this.armor -= attackValue;
    }
}
