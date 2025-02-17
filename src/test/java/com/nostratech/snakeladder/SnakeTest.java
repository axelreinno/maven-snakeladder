package com.nostratech.snakeladder;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SnakeTest {
    private Snake snake;

    @BeforeEach
    public void setUp() {
        snake = new Snake(20, 5);
    }

    @Test
    public void snake_withConstructorProvided_shouldNotBeNull() {
        assertNotNull(snake, "Snake object should not be null");
    }

    @Test
    public void getHead_withConstructorProvided_returnsTwenty() {
        assertEquals(20, snake.getHead(), "Head position should be 20");
    }

    @Test
    public void getTail_withConstructorProvided_returnsFive() {
        assertEquals(5, snake.getTail(), "Tail position should be 5");
    }

    @Test
    public void snake_withMultipleSnakes_snakeOneReturnsTwentyAndFiveAndSnakeTwoReturnsFiftyAndTen() {
        Snake snake1 = new Snake(20, 5);
        Snake snake2 = new Snake(50, 10);
        
        assertEquals(20, snake1.getHead(), "First snake's head should be 20");
        assertEquals(5, snake1.getTail(), "First snake's tail should be 5");
        assertEquals(50, snake2.getHead(), "Second snake's head should be 50");
        assertEquals(10, snake2.getTail(), "Second snake's tail should be 10");
    }
} 