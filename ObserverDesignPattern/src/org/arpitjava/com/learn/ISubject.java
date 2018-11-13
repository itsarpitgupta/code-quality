package org.arpitjava.com.learn;

import java.util.ArrayList;
import java.util.List;

public interface ISubject {
	public void registerObserver(IObserver o);

	public void unregisterObserver(IObserver o);

	public void notifyObservers();

	public List<IObserver> observerList=new ArrayList<IObserver>();
}
