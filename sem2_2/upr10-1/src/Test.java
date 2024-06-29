
public class Test {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1("NameOfThread");		
		MyThread2 ob = new MyThread2();
		Thread t2 = new Thread(ob, "NameOfThread");		
		System.out.println("Starting... - I am the Main thread");
		t1.start();
		t2.start();
		try {
//			System.out.println("Interrupting thread...");
//			t1.interrupt();
//			t2.join();
			for (int i = 0; i < 10; i++) {
				System.out.println("I am the Main thread " + i);
				Thread.sleep(150);
				
			}
			System.out.println("Finished!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
