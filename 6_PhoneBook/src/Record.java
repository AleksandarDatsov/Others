
public class Record {

	private String name;
	private String phoneNumber;
	private int outgoingCalls;

	public Record() {
		this.name = "";
		this.phoneNumber = "";
		this.outgoingCalls = 0;
	}

	public Record(String name) {
		setName(name);
		this.phoneNumber = "";
	}

	public Record(String name, String phoneNumber) {
		setName(name);
		setPhoneNumber(phoneNumber);
	}
	
	public Record(String name, String phoneNumber, int outgoingCalls) {
		setName(name);
		setPhoneNumber(phoneNumber);
		setOutgoingCalls(outgoingCalls);
	}
	public int getOutgoingCalls() {
		return outgoingCalls;
	}

	public void setOutgoingCalls(int outgoingCalls) {
		if (outgoingCalls > -1) {
			this.outgoingCalls = outgoingCalls;
		} else {
			this.outgoingCalls = 0;
		}
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
		return "Name: " + this.name + "\nPhone number: " + this.phoneNumber + "  OutGCalls: " + this.outgoingCalls;
	}

}
