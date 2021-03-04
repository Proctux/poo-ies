package com.github.proctux.poo.evenOrOdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.proctux.poo.evenorodd.GameEvenOrOdd;
import com.github.proctux.poo.evenorodd.Numbers;
import com.github.proctux.poo.evenorodd.PlayerPlay;

public class GameEvenOrOddTest {
	@Test
	public void getOdd() throws Exception {
		PlayerPlay playerOne = new PlayerPlay(1, Numbers.EVEN);
		PlayerPlay playerTwo = new PlayerPlay(2, Numbers.ODD);
		GameEvenOrOdd game = new GameEvenOrOdd(playerOne, playerTwo);
		
		assertEquals(Numbers.ODD, game.getResult());
		assertEquals("Player two win", game.getWinner());
	}
	
	@Test
	public void getEven() throws Exception {
		PlayerPlay playerOne = new PlayerPlay(1, Numbers.EVEN);
		PlayerPlay playerTwo = new PlayerPlay(1, Numbers.ODD);
		GameEvenOrOdd game = new GameEvenOrOdd(playerOne, playerTwo);
		
		assertEquals(Numbers.EVEN, game.getResult());
		assertEquals("Player one win", game.getWinner());
	}
}
