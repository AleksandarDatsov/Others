import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bank {
	private static long currentIban = 114373472l;
	private Map<String, Account> accounts = new HashMap<String, Account>();
	private Map<String, User> clients = new HashMap<String, User>();
	static String generateIban() {

		return "BG" + (currentIban++) + "AK" + (currentIban++);
	}

	public void openAccount(String name, String egn, String type) {
		if(!clients.containsKey(egn)){
		clients.put(egn, new User(name, egn));
	}
		Account newAccount = Account.createAccount(generateIban(), clients.get(egn), type);
		accounts.put(newAccount.getIban(), newAccount);
		
		
	}

	public void removeAccount(String iban) {
		if(iban != null)	
		accounts.remove(iban);
		
	}

//	public void transferMoney(Account acc1, Account acc2, int sum) {
//		if (accounts.contains(acc1) && accounts.contains(acc2) && sum > 0) {
//			if (acc2.getBalance() > sum) {
//
//			}
//
//		}
//	}

	public void listAccounts(String egn) {
		if (egn != null) {
			for (String iban : accounts.keySet()) {
				if(accounts.get(iban).getHolder().getEgn().equals(egn)){
					Account account = accounts.get(iban);
					System.out.println(account);
				}
			}
		}
	}

	public void deposit(String iban, int sum) {
		this.accounts.get(iban).deposit(sum);
	}

	public void withDraw(String iban, int sum) {
		this.accounts.get(iban).withDrow(sum);
	}
}
