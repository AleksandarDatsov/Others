public class SimpleNotepad implements INotepad {
	protected Page[] pages;
	private int freePlacesForPages;

	SimpleNotepad() {

	}

	SimpleNotepad(int numberOfPages) {
		pages = new Page[numberOfPages];
		setFreePlacesForPages(pages.length);
	}

	public Page[] getPages() {
		return pages;
	}

	public void setPages(Page[] pages) {

		this.pages = pages;
	}

	public int getFreePlacesForPages() {
		return freePlacesForPages;
	}

	public void setFreePlacesForPages(int freePlacesForPages) {
		this.freePlacesForPages = freePlacesForPages;
	}

	@Override
	public void addText(String someText, Page page) {
		// if(someText != null && page != null){
		for (int i = 0; i < pages.length; i++) {
			if (pages[i] != null) {
				if (pages[i].getTitle().equals(page.getTitle()))
					pages[i].setText(someText);
				return;
			}
		}
	}

	@Override
	public void deleteAndAddNewText(String someText, Page number) {
		if (someText != null && number != null) {
			number.deleteText();
			number.setText(someText);
		}
	}

	@Override
	public void deleteText(String deleteText, Page pageNumber) {
		if (pageNumber != null) {
			pageNumber.deleteText();
		}

	}

	@Override
	public void scanPages() {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i] != null) {
				pages[i].getTitle();
				pages[i].getText();
			}
		}

	}

	@Override
	public void addPage(Page page) {
		if (freePlacesForPages > 0) {
			for (int i = 0; i < pages.length; i++) {
				if (pages[i] == null) {
					pages[i] = page;
					setFreePlacesForPages(getFreePlacesForPages() - 1);
					return;
				}
			}
		} else {
			System.out.println("Òhere is no more place in this notepad..");
		}
	}

	@Override
	public int searchWord(String word) {
		if (word != null) {
			for (int index = 0; index < pages.length - freePlacesForPages; index++) {
				if (pages[index] != null) {
					if (pages[index].searchWord(word) >= 0) {
						System.out.println(pages[index].searchWord(word));
					}
				}
			}
		}else{
		System.out.println("These is no such word");
		return -1;
		}
		return 0;
	}

	@Override
	public void printAllPagesWithDigits() {
		int count = 0;
		for (int index = 0; index < pages.length; index++) {
			if (pages[index] != null) {
				if (pages[index].containsDigit() == 'y')
					pages[index].getTitle();
				pages[index].getText();
				count++;
			}

		}
		if (count == 0) {
			System.out.println("There is no page with digit in it..");
		}

	}

	@Override
	public void readPage(Page page) {
		if (page != null)
			page.reviewText();
	}
}