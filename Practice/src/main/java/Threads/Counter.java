package Threads;

public class Counter {
	
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public synchronized void increment() {
		count++;
	}
	
	public void increment1() {
		count++;
	}

}
