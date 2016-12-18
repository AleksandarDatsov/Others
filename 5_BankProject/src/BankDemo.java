
public class BankDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();

		bank.openAccount("Alek", "9211067123", "Deposit");
		bank.openAccount("Mirella", "9406067124", "Payment");
		bank.openAccount("Sara", "9211067232", "Credit");

		System.out.println("Akauntite na Alek :");
		bank.listAccounts("9211067123");

		bank.deposit("BG114373472AK114373473", 100);
		System.out.println("Akauntite na Alek :");
		bank.listAccounts("9211067123");
		bank.withDraw("BG114373472AK114373473", 60);
		bank.listAccounts("9211067123");
		
//		for (int row = 0; row < 4; row++) {
//
//			for (int col = 0; col < 4; col++) {
//				if (row == 0 || row == 3) {
//					System.out.print("* ");
//				} else if (row > 0 && col == 0 || col == 3) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//System.out.println();
//int a = 4;
//		for (int row = 1; row <= 7; row++) {				
//			for (int col = row; col <= 7; col++) {
//				
//				System.out.print("  ");
//			}
//			for (int i = 1; i < row*2; i++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
	
	}
}
