public class MyThread1 extends Thread {

	public MyThread1(String name) {
		super(name);
	}

	public void print() {
		System.out.println("I am a Thread 1");
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(150);
				print();
			} catch (InterruptedException e) {
				System.err.println("Thread 1 was interrupted!");
				return;
			}
		}
	}
}