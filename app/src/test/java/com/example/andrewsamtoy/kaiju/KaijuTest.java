package com.example.andrewsamtoy.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by andrewsamtoy on 9/6/17.
 */

public class KaijuTest {

    Cat cat;
    Kangaroo kangaroo;
    Jeep jeep;
    Hummer hummer;

    @Before
    public void before(){
        cat = new Cat();
        kangaroo = new Kangaroo();
        jeep = new Jeep();
        hummer = new Hummer();


    }

    @Test
    public void catHasName() {
        assertEquals("Cat", cat.getName());
    }

    @Test
    public void catHasHealthValue(){
        assertEquals(10, cat.getHealthValue());
    }

    @Test
    public void catHasAttackValue(){
        assertEquals(1, cat.getAttackValue());
    }

    @Test
    public void kangarooHasName() {
        assertEquals("Kangaroo", kangaroo.getName());
    }

    @Test
    public void kangarooHasHealthValue(){
        assertEquals(1000, kangaroo.getHealthValue());
    }

    @Test
    public void kangarooHasAttackValue(){
        assertEquals(100, kangaroo.getAttackValue());
    }

    @Test
    public void jeepHasType(){
        assertEquals("Jeep", jeep.getType());

    }

    @Test
    public void jeepHasArmor(){
        assertEquals(50, jeep.getArmor());
    }

    @Test
    public void hummerHasType(){
        assertEquals("Hummer", hummer.getType());
    }

    @Test
    public void catHasRoar(){
        assertEquals("Meow", cat.roar());
    }

    @Test
    public void kangarooHasRoar(){
        assertEquals("BOUNCE", kangaroo.roar());
    }

    public void canDamageVehicles(){
        cat.attack(hummer);
        assertEquals(999, hummer.getArmor());
    }
}