import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Phonebook implements IMap {

	private ArrayList<Record> records = new ArrayList<Record>();
	private final String filePath = "Records";

	public Phonebook() {
		readFromFile(this.filePath);
	}

	public String addRecord(String name, String phNumber, int outgoingCalls) {
		Record rec;
		phNumber = normalized(phNumber);
		if (!phNumber.equals("")) {
			rec = new Record(name, phNumber, outgoingCalls);
			records.add(rec);
			return "Record ["+ rec.getName()+" " + rec.getPhoneNumber() +"] Was Added";
		}
		return "Wrong Number";
	}

	public String deleteRecord(String name) {
		for (int index = 0; index < records.size(); index++) {
			if (records.get(index).getName().equals(name)) {
				records.remove(index);
				return "Record [" + name + "] Was Deleted";
			}
		}
		return "No such Record";
	}

	private String normalized(String phoneNumber) {
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

	public String viewPhoneNumber(String name) {
		for (Record r : records) {
			if (r.getName().equals(name)) {
				return r.getPhoneNumber();
			}
		}
		return "No such Number";
	}

	private void sortArrayByName() {
		Collections.sort(records, new Comparator<Record>() {
			@Override
			public int compare(Record o1, Record o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	private void sortArrayByOutgoingCalls() {
		Collections.sort(records, new Comparator<Record>() {
			@Override
			public int compare(Record o1, Record o2) {
				return o2.getOutgoingCalls() - o1.getOutgoingCalls();
			}
		});
	}
	
	public String printArr() {
		StringBuilder sb = new StringBuilder("");
		sortArrayByName();
		for (Record r : records) {
			sb.append(r.toString() + "\n");
		}
		return sb.toString();
	}

	private void readFromFile(String filePath) {
		String currentLine = "";
		String split[];
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			while ((currentLine = reader.readLine()) != null) {
				split = currentLine.split(" ");
				split[1] = normalized(split[1]);
				if (!split[1].equals("")) {
					addRecord(split[0], split[1], Integer.parseInt(split[2]));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String printTopFiveWithMostOutgoingCalls() {
		StringBuilder sb = new StringBuilder("");
		sortArrayByOutgoingCalls();
		for(int i = 0; i < 5 || i < records.size(); i++){
			sb.append(records.get(i) + "\n");
		}
		return sb.toString();
	}
}