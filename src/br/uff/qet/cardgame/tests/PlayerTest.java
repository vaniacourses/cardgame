package br.uff.qet.cardgame.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.uff.qet.cardgame.Card;
import br.uff.qet.cardgame.Player;
import br.uff.qet.cardgame.Rank;
import br.uff.qet.cardgame.Suit;

public class PlayerTest {

	Player player;

	@Before
	public void createPlayer() {
		this.player = new Player("TestPlayer");
	}

	@Test
	public void testPlayer() {
		assertNotNull(this.player);
	}

	@Test
	public void testTakeCard() {
		Card card = new Card(Suit.CLUBS, Rank.ACE);

		this.player.takeCard(card);

		assertEquals(1, this.player.countHand());
	}

	@Test
	public void testGetHandValue() {
		Card card = new Card(Suit.CLUBS, Rank.ACE);

		this.player.takeCard(card);

		assertEquals(card.getValue(), this.player.getHandValue());
	}
}
