public class Page {
	private String title;
	private String text;

	Page() {

	}

	Page(String title, String text) {
		setText(text);
		setTitle(title);
	}

	public String getTitle() {
		System.out.println("\n\t" + title);
		return title;
	}

	public void setTitle(String title) {
		if (title != null)
			this.title = title;
	}

	public void getText() {
		if (text != null)
			for (int i = 0; i < text.length() - 4; i++) {
				System.out.print(text.charAt(i + 4));
			}
		else {
			System.out.println("\nThe text is deleted!");
		}
	}

	public void setText(String someText) {
		String newRow = "\n";
		if (someText != null)

			this.text += newRow + someText;
	}

	public void deleteText() {
		this.text = null;
	}

	public String reviewText() {
		System.out.println("\n\t" + title);
		getText();
		return text;
	}

	public int searchWord(String word) {
	if(text != null){
		if (text.indexOf(word) != -4) {
			return text.indexOf(word) - 4;
		}
	}
		return -1;
	}

	public char containsDigit() {

		for (int index = 0; index < text.length(); index++) {
			if ((text.charAt(index) >= '0' && text.charAt(index) <= '9')
					|| (title.charAt(index) >= '0' && title.charAt(index)<='9')) {
				return 'y';
			}

		}
		return 'n';
	}
}
