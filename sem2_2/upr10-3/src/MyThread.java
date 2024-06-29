
public class MyThread extends Thread {

	int sum = 0;

	public void run() {
		synchronized (this) {
			this.suming();
			
			notify();
		}
	System.out.println("Finished summing. Now the program can continue...");
	}

	public void suming() {
		System.out.println("Suming the first 500 integers...");
		for (int i = 1; i <= 500; i++) {
			this.sum = this.sum + i;		
		}
	}
}
