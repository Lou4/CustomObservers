package com.lou.observer;

import com.lou.observable.CustomObservervable;

public interface ScoreObserver extends CustomObserver{
	void updateScore(CustomObservervable o, Object arg);
}
