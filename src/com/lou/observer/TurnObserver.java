package com.lou.observer;

import com.lou.observable.CustomObservervable;


public interface TurnObserver extends CustomObserver {
	void updateTurn(CustomObservervable o, Object arg);
}
