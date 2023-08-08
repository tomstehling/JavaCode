package main.bankaccount;

public class BankAccount {
	private Integer balance;
	protected Object mutex = new Object();

	public BankAccount(Integer balance) {
		this.balance = balance;
	}

	public  Integer getBalance() {
		synchronized(mutex) {
		return balance;
		}

	}

	public void spend(Integer amount) {
		synchronized(mutex){

			if (balance > 0) {
				balance -= amount;
			}
		}
	}

}
