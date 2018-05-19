
public class Atm {

	private int balance;
	private String requiredPin = "hello";

	public Atm(int balance) {
		this.balance = balance;
	}

	public int getBalance() {

		return balance;
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			balance -= 0;  
			System.out.println("in-sufficient funds");// put a println here later
		}else if(amount%10 != 0) {
			balance -= 0; // put a println here later
		}
		 else {
			balance -= amount;
		}
	}

	public int getNextBalance() {

		return balance;

	}

	public void deposit(int amount) {
		balance += amount;

	}

	public boolean allowAccess(String enteredPin) {
		if (requiredPin.equals(enteredPin)) {
			return true;
		} else {
			return false;

		}
	}

	public String getRequiredPin() {
		return requiredPin;
	}
}
