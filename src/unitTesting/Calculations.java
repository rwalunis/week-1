package unitTesting;

public class Calculations {

	final int bankAccount = 30000;
	int mortgageBill;
	int phoneBill;

	public int getBankAccount() {
		return bankAccount;
	}

	public int monthlyBillPayment(int mortgageBill, int phoneBill) {
		return mortgageBill + phoneBill;
	}

	static boolean over50(int num) {
		if (num > 50) {
			System.out.println("Your number is over 50.");

			return true;

		} else {
			System.out.println("Your number is not over 50");
		}
		return false;
	}

}
