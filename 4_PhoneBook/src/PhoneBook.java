import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook implements IPhonebookFunctions{

	private ArrayList<Record> records = new ArrayList<Record>();

	public PhoneBook() {
		readFromFile();
	}

	public void addRecord(String name, String phNumber) {
		Record rec;
		phNumber = isNumberGood(phNumber);
		if (!phNumber.equals("")) {
			rec = new Record(name, phNumber);
			records.add(rec);
			sortArray();
			System.out.println("The contact was added");
		}else{
			System.out.println("Wrong phNumber");
		}
	}

	public void deleteRecord(String name){
		for(int index = 0; index < records.size(); index++){
			if(records.get(index).getName().equals(name)){
				records.remove(index);
			}
		}
	}
	private String isNumberGood(String phoneNumber) {
		if (phoneNumber.matches("^(\\+359|00359|0)[8]{1}[7-9]{1}[2-9]{1}(\\d{6})$")) {
			switch (phoneNumber.substring(0, 2)) {
			case "08":
				phoneNumber = "+359" + phoneNumber.substring(1, phoneNumber.length());
				break;
			case "00":
				phoneNumber = "+359" + phoneNumber.substring(5, phoneNumber.length());
				break;
			}
			return phoneNumber;

		}
		return "";
	}

	public void viewPhoneNumber(String name){
		for(Record r : records){
			if(r.getName().equals(name)){
				System.out.println(r);
			}
		}
	}
	private void sortArray() {
		Collections.sort(records, new Comparator<Record>() {
			@Override
			public int compare(Record o1, Record o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public void printArr() {
		for (Record r : records) {
			System.out.println(r);
		}
	}

	private void readFromFile() {
		String currentLine = "";
		String split[];
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\frog\\Desktop\\IOtask\\Records.txt"))) {
			while ((currentLine = reader.readLine()) != null) {
				split = currentLine.split(" ");
				split[1] = isNumberGood(split[1]);
				if (!split[1].equals("")) {
					addRecord(split[0], split[1]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}