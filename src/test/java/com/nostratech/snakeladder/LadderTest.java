package com.nostratech.snakeladder;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class LadderTest {
    private Ladder ladder;

    @BeforeEach
    public void setUp() {
        ladder = new Ladder(5, 20);
    }
    
    @Test
    public void ladder_withConstructorProvided_shouldNotBeNull() {
        assertNotNull(ladder, "Ladder object should not be null");
    }

    @Test
    public void getTop_withConstructorProvided_returnsTwenty() {
        assertEquals(20, ladder.getTop(), "Top position should be 20");
    }

    @Test
    public void getBottom_withConstructorProvided_returnsFive() {
        assertEquals(5, ladder.getBottom(), "Bottom position should be 5");
    }

    @Test
    public void ladder_withMultipleLadders_ladderOneReturnsFiveAndTwentyAndLadderTwoReturnsTenAndFifty() {
        Ladder ladder1 = new Ladder(5, 20);
        Ladder ladder2 = new Ladder(10, 50);
        
        assertEquals(5, ladder1.getBottom(), "First ladder's bottom should be 5");
        assertEquals(20, ladder1.getTop(), "First ladder's top should be 20");
        assertEquals(10, ladder2.getBottom(), "Second ladder's bottom should be 10");
        assertEquals(50, ladder2.getTop(), "Second ladder's top should be 50");
    }
}
