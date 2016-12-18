
public class CreditAccount extends Account {

	public CreditAccount(int balance, String iban, User holder) {
		super(balance, iban, holder);
		// TODO Auto-generated constructor stub
	}
	private static final double CREDIT_ACCOUNT_INTEREST = 9.0;

	

	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return -CREDIT_ACCOUNT_INTEREST;
	}
@Override
public void withDrow(int amount) {
	setBalance(getBalance() - amount);
}
}
