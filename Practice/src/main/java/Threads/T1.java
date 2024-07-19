package Threads;

public class T1 extends Thread{

	public void run(int j) {
		while(j<=10) {
			System.out.println("T1 -> "+j);
			j++;
		}
	}
}
