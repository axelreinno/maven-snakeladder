package com.nostratech.snakeladder;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private Dice dice;

    @BeforeEach
    public void setUp() {
        dice = new Dice(6);
    }
    

    @Test
    public void Dice_withConstructorProvided_shouldNotBeNull() {
        assertNotNull(dice, "Dice object should not be null");
    }

    @Test
    public void getSides_withConstructorProvided_returnsSix() {
        assertEquals(6, dice.getSides(), "Dice object should not be null");
    }

    @Test
    public void roll_withSixSides_returnsNumberBetweenOneAndSix() {
        for (int i = 0; i < 100; i++) {
            int result = dice.roll();
            assertTrue(result >= 1 && result <= dice.getSides(), "Dice roll should be between 1 and 6, but got " + result);
        }
    }
} 