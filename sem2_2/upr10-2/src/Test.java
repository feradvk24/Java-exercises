
public class Test {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			Account ob = new Account();
			ClientThread ob1 = new ClientThread(ob, 100);
			ClientThread ob2 = new ClientThread(ob, 200);
			ClientThread ob3 = new ClientThread(ob, 300);
			ClientThread ob4 = new ClientThread(ob, 400);
			ClientThread ob5 = new ClientThread(ob, 500);
			Thread T1 = new Thread(ob1);
			Thread T2 = new Thread(ob2);
			Thread T3 = new Thread(ob3);
			Thread T4 = new Thread(ob4);
			Thread T5 = new Thread(ob5);
			Thread T6 = new Thread(ob5);
			Thread T7 = new Thread(ob2);
			Thread T8 = new Thread(ob3);
			Thread T9 = new Thread(ob5);
			T1.start();
			T2.start();
			T3.start();
			T4.start();
			T5.start();
			T6.start();
			T7.start();
			T8.start();
			T9.start();
			try {
				Thread.sleep(100);
				if (ob.getAmmount() != 3000) {
					System.out.println(ob.getAmmount());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		System.out.println("Finished!");
	}
}