package br.uff.qet.cardgame.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.uff.qet.cardgame.Deck;
import br.uff.qet.cardgame.Rank;
import br.uff.qet.cardgame.Suit;

public class DeckTest {

	Deck deck;

	@Before
	public void createDeck() {
		this.deck = new Deck();
	}

	@Test
	public void testDeck() {
		assertNotNull(this.deck);
	}

	@Test
	public void testCountUnshuffledCards() {
		this.deck.addCards();
		assertEquals(Suit.values().length * Rank.values().length, this.deck.countUnshuffledCards());
	}

	@Test
	public void testShuffle() {
		this.deck.addCards();
		this.deck.shuffle();
		assertEquals(Suit.values().length * Rank.values().length, this.deck.countCards());
	}

	@Test
	public void testDealCard() {
		this.deck.addCards();
		this.deck.shuffle();

		int previousSize = this.deck.countUnshuffledCards();

		this.deck.dealCard();

		assertEquals(previousSize - 1, this.deck.countCards());
	}

}
