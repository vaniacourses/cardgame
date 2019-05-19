package br.uff.qet.cardgame.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.uff.qet.cardgame.Game;
import br.uff.qet.cardgame.Player;

public class GameTest {

	Game game;

	@Before
	public void createGame() {
		this.game = new Game();
	}

	@Test
	public void testGame() {
		assertNotNull(this.game);
	}

	@Test
	public void testAddPlayer() {
		this.game.addPlayer(new Player("Test Player"));

		assertEquals(1, this.game.countPlayers());
	}

	@Test
	public void testDealGame() {
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		this.game.addPlayer(player1);
		this.game.addPlayer(player2);

		this.game.dealGame();

		assertEquals(1, player1.countHand());
		assertEquals(1, player2.countHand());
	}

	@Test
	public void testCheckWinner() {
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		this.game.addPlayer(player1);
		this.game.addPlayer(player2);

		this.game.dealGame();

		assertEquals("Someone wins", this.game.checkWinner());
	}

}
