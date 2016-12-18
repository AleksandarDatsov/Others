
public abstract class Account implements IAccount {

	private User holder;
	private int balance;
	private String iban;

	public Account(int balance, String iban, User holder) {
		setBalance(balance);
		setIban(iban);
		setHolder(holder);
	}

	public abstract double getInterest();

	public void withDrow(int amount) {
		if (getBalance() - amount >= 0) {
			setBalance(getBalance() - amount);
		}
	}

	public static Account createAccount(String iban, User holder, String type) {

		if (type.equals("Credit")) {
			return new CreditAccount(0, iban, holder);
		}
		if (type.equals("Deposit")) {
			return new DepositAccount(0, iban, holder);
		}
		if (type.equals("Payment")) {
			return new PayAccount(0, iban, holder);
		}
		return null;
	}

	public void deposit(int amount) {
	if(amount > 0){
		setBalance(getBalance()+amount);
	}
	}

	int getBalance() {

		return balance;
	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	public User getHolder() {
		return holder;
	}

	public void setHolder(User holder) {
		if (holder != null)
			this.holder = holder;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		if (iban.startsWith("BG") && iban.length() == 22 && iban != null)
			this.iban = iban;
	}
 @Override
	public String toString() {
		return "Account [ballance= " + balance + ", iban= " + iban + ", holder= " + holder + "]";
	}
}
