package com.nostratech.snakeladder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    private Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void getNextPosition_withPositionFive_returnsPositionFive() {
        assertEquals(5, board.getNextPosition(5), "Position should be 5");
    }

    @Test
    public void getNextPosition_withSnakeProvidedAndPositionInHead_ReturnsTail() {
        Snake snake = new Snake(20, 10);
        board.addSnake(snake);
        
        assertEquals(10, board.getNextPosition(20), "Position should be 10");
    }

    @Test
    public void getNextPosition_withLadderProvidedAndPositionInBottom_ReturnsTop() {
        Ladder ladder = new Ladder(10, 50);
        board.addLadder(ladder);
        
        assertEquals(50, board.getNextPosition(10), "Position should be 50");
    }

    @Test
    public void getNextPosition_MultipleSnakesAndLadders_ReturnsCorrectPosition() {
        Snake snake1 = new Snake(14, 7);
        Snake snake2 = new Snake(20, 3);
        Ladder ladder1 = new Ladder(4, 12);
        Ladder ladder2 = new Ladder(8, 15);
        
        board.addSnake(snake1);
        board.addSnake(snake2);
        board.addLadder(ladder1);
        board.addLadder(ladder2);
        
        assertEquals(7, board.getNextPosition(14), "Position should be 7");
        assertEquals(3, board.getNextPosition(20), "Position should be 3");
        assertEquals(12, board.getNextPosition(4), "Position should be 12");
        assertEquals(15, board.getNextPosition(8), "Position should be 15");
        assertEquals(10, board.getNextPosition(10), "Position should be 10");
    }
} 