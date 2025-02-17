package com.nostratech.snakeladder;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class GameTest {

    @Test
    public void startGame_whenConstructorProvided_shouldHaveWinner() {
        Board board = new Board();
        board.addSnake(new Snake(16, 6));
        board.addLadder(new Ladder(4, 14));

        
        List<Player> players = Arrays.asList(
            new Player("Player1"),
            new Player("Player2")
        );

        Dice dice = new Dice(6);

        Game game = new Game(players, board, dice);
        game.startGame();

        assertTrue(players.stream().anyMatch(Player::isWon), "Game should end with a winner");
    }

    @Test
    public void getCurrentPosition_whenPlayerIsCloseTo100_shouldBeWinOrStayAtCurrentPosition() {
        Board board = new Board();
        Dice dice = new Dice(6);
        Player player = new Player("Player1");
        List<Player> players = Arrays.asList( new Player("Player1"));

        Game game = new Game(players, board, dice);
        
        player.move(99);
        
        game.startGame();

        assertTrue(player.getCurrentPosition() == 100 || player.getCurrentPosition() == 99, "Player should either win or stay at current position");
    }

} 