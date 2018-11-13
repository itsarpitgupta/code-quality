package org.arpitjava.com.learn;

public class CricketData implements ISubject {

	int runs;
	float overs;
	int wickets;

	@Override
	public void registerObserver(IObserver o) {
		this.observerList.add(o);
	}

	@Override
	public void unregisterObserver(IObserver o) {
		this.observerList.remove(o);
	}

	@Override
	public void notifyObservers() {
		this.observerList.stream().forEach(o -> o.update(runs, wickets, overs));
	}

	// get latest runs from stadium
	private int getLatestRuns() {
		// return 90 for simplicity
		return 90;
	}

	// get latest wickets from stadium
	private int getLatestWickets() {
		// return 2 for simplicity
		return 2;
	}

	// get latest overs from stadium
	private float getLatestOvers() {
		// return 90 for simplicity
		return (float) 10.2;
	}

	// This method is used update displays
	// when data changes
	public void dataChanged() {
		// get latest data
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();

		notifyObservers();
	}
}
