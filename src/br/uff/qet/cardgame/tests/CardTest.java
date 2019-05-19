package br.uff.qet.cardgame.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.uff.qet.cardgame.Card;
import br.uff.qet.cardgame.Rank;
import br.uff.qet.cardgame.Suit;

public class CardTest {

	Card card;
	
	@Before
	public void create() {
		this.card = new Card(Suit.CLUBS, Rank.ACE);
	}
	
	@Test
	public void testCard() {
		assertNotNull(this.card);
	}

	@Test
	public void testGetSuit() {
		assertEquals(Suit.CLUBS, this.card.getSuit());
	}

	@Test
	public void testGetType() {
		assertEquals(Rank.ACE, this.card.getType());
	}

	@Test
	public void testGetValue() {
		assertEquals(1, this.card.getValue());
	}

}
