
public class ClientThread extends Thread {

	private double amount;
	private Account account;

	ClientThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;

	}

	public void run() {
		account.setAmmount(amount);
	}

}
