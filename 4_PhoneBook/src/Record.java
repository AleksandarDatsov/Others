
public class Record {

	private String name;
	private String phoneNumber;

	public Record() {
		this.name = "";
		this.phoneNumber = "";
	}

	public Record(String name) {
		setName(name);
		this.phoneNumber = "";
	}

	public Record(String name, String phoneNumber) {
		setName(name);
		setPhoneNumber(phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "";
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber != null) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "";
		}
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nPhone number: " + this.phoneNumber;
	}

}
