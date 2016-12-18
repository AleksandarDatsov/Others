public class ElectronicSecuredNotepad extends SecuredNotepad implements
		IÅlectronicDevice, INotepad {

	private boolean on;

	ElectronicSecuredNotepad( int numberOfPages) {
		super(numberOfPages);

	}

	@Override
	public void start() {
		on = true;
	}

	@Override
	public void stop() {
		on = false;
	}

	@Override
	public boolean isStart() {
		if (on == true) {
			return true;
		}
		return false;
	}

	@Override
	public void addText(String someText, Page pageNumber) {
		if (isStart() == true) {
			super.addText(someText, pageNumber);
			System.out.println("U've addet a new text");
		}
		textMessage();
	}

	@Override
	public void deleteAndAddNewText(String someText, Page number) {
		if (isStart() == true) {
			super.deleteAndAddNewText(someText, number);
			System.out
					.println("The old text was deleted and the new one is addet!");
		}
		textMessage();
	}

	@Override
	public void deleteText(String deleteText, Page pageNumber) {
		if (isStart() == true) {
			super.deleteText(deleteText, pageNumber);
			System.out.println("The text was deleted!");
		}
		textMessage();
	}

	@Override
	public void scanPages() {
		if (isStart() == true) {
			super.scanPages();
		} else {
			textMessage();
		}
	}

	@Override
	public void addPage(Page page) {
		if (isStart() == true) {
			super.addPage(page);
		} else {
			textMessage();
		}

	}

	@Override
	public void readPage(Page page) {
		if (isStart() == true) {
			super.readPage(page);
		} else {
			textMessage();
		}
	}


	@Override
	public int searchWord(String word) {
		if (isStart() == true) {
			super.searchWord(word);
		}
		return-1;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStart() == true) {
			super.printAllPagesWithDigits();
		} else {
			textMessage();
		}
	}

	private void textMessage() {
		System.out.println("U must first turn on your notepad!");
	}
}
