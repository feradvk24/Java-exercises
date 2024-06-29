
public class MyThread2 implements Runnable {

	public void print() {
		System.out.println("I am a Thread 2");
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(150);
				print();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
