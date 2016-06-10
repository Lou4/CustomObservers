package com.lou.observable;

import java.util.Observable;


public class Model extends CustomObservervable{

	private int score;
	private int turn;
	
	public int getScore(){
		return score;
	}
	
	public int getTurn(){
		return turn;
	}
	public void setScore(int newScore){
		score = newScore;
		setScoreChanged();
		notifyScoreObserver(null, score);
	}
	
	public void setTurn(int newTurn){
		turn = newTurn;
		setScoreChanged();
		notifyTurnObserver(null, turn);
	}
}
