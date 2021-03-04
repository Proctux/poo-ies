package com.github.proctux.poo.evenorodd;

public class EvenOrOdd {
	public Integer number;
	public String playerOnePick;
	public String playerTwoPick;
	
	public EvenOrOdd(Integer number, String playerOnePick, String playerTwoPick) {
		this.number = number;
		this.playerOnePick = playerOnePick;
		this.playerTwoPick = playerTwoPick;
	}
	
	public String getEvenOrOdd() {
		if (this.number % 2 == 0) {
			return "Par";
		} else {
			return "Impar";
		}
	}
	
	public String winnerPlayer() {
		if(this.playerOnePick == this.getEvenOrOdd()) {
			return "Player one win";
		} else {
			return "Player two win";
		}
	}
}
