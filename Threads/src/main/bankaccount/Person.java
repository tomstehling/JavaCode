package main.bankaccount;

public class Person implements Runnable {
	private String name;
	private BankAccount account;
	private Integer amountToSpend;
	private Integer totalAmountSpent = 0;

	public Person(String name, BankAccount account, Integer amountToSpend) {
		this.name = name;
		this.account = account;
		this.amountToSpend = amountToSpend;
		this.totalAmountSpent = 0;
	}

	@Override
	public void run() {
	
		goShopping();
		
	}

	

	private void goShopping() {
		while (checkAccount()) {
			synchronized(this.account) {
				if(checkAccount()) {
					account.spend(amountToSpend);
			        totalAmountSpent += amountToSpend;
			    }
			}
		}
	}
	
	private boolean checkAccount() {
			//synchronized(this.account) {
				return account.getBalance() >= amountToSpend;
				
			//}
	}

	public String getName() {
		return name;
	}
	
	public Integer getTotalAmountSpent() {
			return totalAmountSpent;	
	}

	
}
