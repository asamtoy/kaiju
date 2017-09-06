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

    @Before
    public void before(){
        cat = new Cat();
        kangaroo = new Kangaroo();

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
    public void
}