package br.uff.qet.cardgame.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.uff.qet.cardgame.Dealer;
import br.uff.qet.cardgame.Player;
import br.uff.qet.cardgame.Rank;
import br.uff.qet.cardgame.Suit;

public class DealerTest {

	Dealer dealer;

	@Before
	public void createDealer() {
		this.dealer = new Dealer();
	}

	@Test
	public void testDealer() {
		assertNotNull(this.dealer);
	}

	@Test
	public void testCountUnshuffledCards() {
		assertEquals(Suit.values().length * Rank.values().length, this.dealer.countUnshuffledCards());
	}

	@Test
	public void testCountCards() {
		assertEquals(Suit.values().length * Rank.values().length, this.dealer.countCards());
	}

	@Test
	public void testDealCard() {
		Player player = new Player("Test Player");
		
		int previousSize = player.countHand();
		
		this.dealer.dealCard(player);
		
		assertEquals(previousSize + 1, player.countHand());
	}
}
