
public class DepositAccount extends Account {

	public DepositAccount(int balance, String iban, User holder) {
		super(balance, iban, holder);
		// TODO Auto-generated constructor stub
	}

	private static final double DEPOSIT_ACCOUNT_INTEREST = 5.0;

	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return DEPOSIT_ACCOUNT_INTEREST;
	}

}
