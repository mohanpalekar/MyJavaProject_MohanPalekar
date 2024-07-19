package Threads;

public class T2 extends Thread{

	public void run(int j) {
		while(j<=10) {
			System.out.println("T2 -> "+j);
			j++;
		}
	}
}
