package edu.training.lesson12.counter;

public class Counter {
	private int counter;

	private int from;
	private int to;

	public Counter() {
		this(0, 10, 0);
	}

	public Counter(int counter) {
		this(0, 10, counter);
	}

	public Counter(int startValue, int endValue) {
		this(startValue, endValue, startValue);
	}

	public Counter(int startValue, int endValue, int counter) {
		if (counter < startValue || counter > endValue) {
			throw new RuntimeException("Can't create an object."); 
		}
		if (startValue > endValue) {
			throw new RuntimeException("Can't create an object."); 
		}
		from = startValue;
		to = endValue;
		this.counter = counter;
	}

	public void inc() {
		counter++;
		if (counter > to)
			counter = from;
	}

	public void dec() {
		counter--;
		if (counter < from)
			counter = to;
	}

	public int getCount() {
		return counter;
	}
}