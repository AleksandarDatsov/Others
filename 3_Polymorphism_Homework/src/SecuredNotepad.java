import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements INotepad {

	private String password;
	Scanner sc = new Scanner(System.in);

	SecuredNotepad(int numberOfPages) {
		while (true) {
			System.out.println("Enter Password For Your Device");
			password = sc.nextLine();
			setPassword(password);
			pages = new Page[numberOfPages];
			setFreePlacesForPages(pages.length);

			if (isPasswordCreate() > 0) {
				System.out.println("Congratilation that's a great password!");
				return;
			} else {
				System.out
						.println("\nEnter password with at least 5 characters containing"
								+ " \n   a digit, a capital leter and a small letter!");
				password = sc.nextLine();
				setPassword(password);
			}
		}

	}

	public String getPassword() {
		if (password != null)
			return password;
		return "U need first to create password";
	}

	private int isPasswordCreate() {
		if (password != null) {
			return +1;
		}
		return -1;

	}

	public void setPassword(String password) {
		int ch1;
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		if (password != null)
			for (int i = 0; i < password.length(); i++) {
				ch1 = password.charAt(i);
				
				if (ch1 >= 'A' && ch1 <= 'Z') {
					count++;
				}
				if (ch1 >= 'a' && ch1 <= 'z') {
					count2++;
				}
				if (ch1 >= '0' && ch1 <= '9') {
					count3++;
				}
				if ((count > 0 && count2 > 0 && count3 > 0)
						&& (count + count2 + count3 > 4)) {
					this.password = password;
					return;
				}
			}
		return;
	}

	@Override
	public void addText(String someText, Page pageNumber) {
		if (isPasswordCorrect() == true) {
			super.addText(someText, pageNumber);
		} else {
			System.out.println("Wrong password");
		}
	}

	@Override
	public void deleteAndAddNewText(String someText, Page number) {
		if (isPasswordCorrect() == true) {
			super.deleteAndAddNewText(someText, number);
		}
		System.out.println("Wrong password");
	}

	@Override
	public void deleteText(String deleteText, Page pageNumber) {
		if (isPasswordCorrect() == true) {
			super.deleteText(deleteText, pageNumber);
		} else {
			System.out.println("Wrong password");
		}
	}

	@Override
	public void scanPages() {
		if (isPasswordCorrect() == true) {
			super.scanPages();
		} else {
			System.out.println("Wrong password");
		}
	}

	@Override
	public void addPage(Page page) {
		if (isPasswordCorrect() == true) {
			System.out.println("U've added a new page in your S.Notepad");
			super.addPage(page);
		} else {
			System.out.println("Wrong pass");
		}
	}

	public void readPage(Page page) {
		if (isPasswordCorrect() == true) {
			if (page != null) {
				super.readPage(page);
			}
		}
	}

	
	@Override
	public int searchWord(String word) {
		if (isPasswordCorrect() == true) {
			super.searchWord(word);
		}
		return -1;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isPasswordCorrect() == true) {
			super.printAllPagesWithDigits();
		}
	}

	private boolean isPasswordCorrect() {
		message();
		String enterPassword = sc.nextLine();
		if (enterPassword.equals(password)) {
			return true;
		}
		return false;
	}

	private void message() {
		System.out.println("\nEnter your SecuredNotepad password");
	}

}
