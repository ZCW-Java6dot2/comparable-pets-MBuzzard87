package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuckTest {
    Duck duck = new Duck("Quackers");

    @Test
    public void testCatName() {
        String expectedName = "Quackers";
        duck.setName(expectedName);
        String actualName = duck.getName();
        assertEquals(expectedName, actualName);
    }


    @Test
    public void speak() {
        String expectedSpeak = "Quack";
        String actualSpeak = duck.speak();
        assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testDuckInheritance() {
        Boolean inherits = duck instanceof Pet;
        assertTrue(inherits);
    }
}