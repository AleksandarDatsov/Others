public interface INotepad {

	void addText(String someText, Page number);

	void deleteAndAddNewText(String someText, Page number);

	void deleteText(String deleteText, Page number);

	void scanPages();

	void addPage(Page page);
	
	void readPage(Page page);
	
	int searchWord(String word);

	void printAllPagesWithDigits();
}
