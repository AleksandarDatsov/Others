import java.util.Scanner;

public class NotepadDemo {
	public static void main(String[] args) {

		Page first = new Page("Title on first page", "And1 i'm the text on page one!");
		Page second = new Page("Title 2 on second page", "And i'm the text on page two!");
		Page third = new Page("Title 3 on third page", "And i'm the text on page three!");
		Page fourth = new Page("Title 4 on fourth page", "And i'm the text on page four!");
		Page fift = new Page("Title 5 on fift page", "And i'm the text on page five!");

		ElectronicSecuredNotepad eSecNotepad = new ElectronicSecuredNotepad(10);
		SimpleNotepad simpleNotepad = new SecuredNotepad(22);
		
		eSecNotepad.start();
		eSecNotepad.addPage(first);
		eSecNotepad.addPage(fourth);
		eSecNotepad.addPage(second);
		eSecNotepad.readPage(fift);
		eSecNotepad.searchWord("the");
		eSecNotepad.stop();
		eSecNotepad.searchWord("sds");
		eSecNotepad.printAllPagesWithDigits();
		System.out.println(eSecNotepad.getFreePlacesForPages());
		System.out.println(eSecNotepad.searchWord("one!"));
		eSecNotepad.deleteAndAddNewText("Are be", third);
		eSecNotepad.deleteText("", third);
		eSecNotepad.getPages()[2].reviewText();
		eSecNotepad.scanPages();
		eSecNotepad.getPages()[1].getTitle();
		for (int i = 0; i < eSecNotepad.getPages().length; i++) {
			if (eSecNotepad.getPages()[i] != null)
				System.out.println(eSecNotepad.getPages()[i].getTitle());
		}

		Page sixt = new Page("Title six", "text 6");
		SecuredNotepad secured = new SecuredNotepad(10);
		secured.addPage(sixt);
		secured.readPage(sixt);

	}
}
