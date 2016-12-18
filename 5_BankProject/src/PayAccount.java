
public class PayAccount extends Account {

	public PayAccount(int balance, String iban, User holder) {
		super(balance, iban, holder);
		// TODO Auto-generated constructor stub
	}



	private static final double PAY_ACCOUNT_INTEREST = 4.0;

	

	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return PAY_ACCOUNT_INTEREST;
	}

}
