package com.nostratech.snakeladder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void player_withConstructorProvided_shouldNotBeNull() {
        Player player = new Player("Axel");
        assertNotNull(player, "Player object should not be null");
    }

    @Test
    public void getName_withConstructorProvided_returnsAxel() {
        Player player = new Player("Axel");
        assertEquals("Axel", player.getName(), "Player name should be Axel");
    }

    @Test
    public void getCurrentPosition_withConstructorProvided_returnsZero() {
        Player player = new Player("Axel");
        assertEquals(0, player.getCurrentPosition(), "Player position should be 0");
    }

    @Test
    public void move_withPositionFive_returnsPositionFive() {
        Player player = new Player("Axel");
        player.move(5);
        assertEquals(5, player.getCurrentPosition(), "Player position should be 5");
    }

    @Test
    public void isWon_whenPositionGreaterEqualThan100_returnsTrue() {
        Player player = new Player("Axel");
        player.move(100);
        assertTrue(player.isWon(), "Player should be won");
    }

    @Test
    public void isWon_whenPositionLessThan100_returnsFalse() {
        Player player = new Player("Axel");
        player.move(99);
        assertFalse(player.isWon(), "Player should not be won");
    }
} 