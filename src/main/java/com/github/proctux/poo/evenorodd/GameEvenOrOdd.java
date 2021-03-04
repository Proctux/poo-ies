package com.github.proctux.poo.evenorodd;

public class GameEvenOrOdd {
	public PlayerPlay firstPlay;
	public PlayerPlay secondPlay;
	
	public GameEvenOrOdd(PlayerPlay playerOne, PlayerPlay playerTwo) {
		this.firstPlay = playerOne;
		this.secondPlay = playerTwo;
	}
	
	public Integer sumResult() {
		Integer sum = Integer.sum(firstPlay.playerNumber, secondPlay.playerNumber);
		return sum;
	}
	
	public boolean isEven(Integer result) {
		return result % 2 == 0;
	}
	
	public Numbers getResult() {
		Integer result = sumResult();
		
		if(isEven(result)) {
			return Numbers.EVEN;
		}
		
		return Numbers.ODD;
	}
	
	
	
	public String getWinner() {		
		if(firstPlay.playerBet.equals(getResult())) {
			return "Player one win";
		} else {
			return "Player two win";
		}
	}

}
