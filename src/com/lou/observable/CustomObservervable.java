package com.lou.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.lou.observer.CustomObserver;
import com.lou.observer.ScoreObserver;
import com.lou.observer.TurnObserver;

public abstract class CustomObservervable {
	private List<ScoreObserver> scoreObserver;
	private List<TurnObserver> turnObserver;
	private boolean scoreChanged;
	private boolean turnChanged;
	
	public CustomObservervable() {
		scoreObserver = new ArrayList<ScoreObserver>();
		turnObserver = new ArrayList<TurnObserver>();
	}
	
	public void addScoreObserver(ScoreObserver o){
		scoreObserver.add(o);
	}
	
	public void addTurnObserver(TurnObserver o){
		turnObserver.add(o);
	}
	
	public void setScoreChanged(){
		scoreChanged = true;
	}
	
	public void resetScoreFlag(){
		scoreChanged = false;
	}
	
	public void setTurnChanged(){
		turnChanged = true;
	}
	
	public void resetTurnFlag(){
		turnChanged = false;
	}
	
	public void notifyScoreObserver(CustomObservervable o, Object arg){
		for(ScoreObserver obs: scoreObserver)
			obs.updateScore(o, arg);
	}
	
	public void notifyTurnObserver(CustomObservervable o, Object arg){
		for(TurnObserver obs: turnObserver)
			obs.updateTurn(o, arg);
	}
}
