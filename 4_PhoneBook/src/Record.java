
public class Record {

	private String name;
	private String phoneNumber;

	public Record() {
		this.name = "";
		this.phoneNumber = "";
	}

	public Record(String name) {
		this.name = name;
		this.phoneNumber = "";
	}
	
	public Record(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nPhone number: " + this.phoneNumber;
	}

}
