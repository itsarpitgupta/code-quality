package org.arpitjava.com.learn;

class AverageScoreDisplay implements IObserver {
	private float runRate;
	private int predictedScore;

	public void update(int runs, int wickets, float overs) {
		this.runRate = (float) runs / overs;
		this.predictedScore = (int) (this.runRate * 50);
		display();
	}

	public void display() {
		System.out.println("Average Score Display: \n" + "Run Rate: " + runRate + "\nPredictedScore: " + predictedScore);
	}
}