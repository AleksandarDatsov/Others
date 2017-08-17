
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
		this.name = name;
		this.phoneNumber = "";
		this.outgoingCalls = 0;
	}
	
	public Record(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.outgoingCalls = 0;
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

	public int getOutgoingCalls() {
		return outgoingCalls;
	}

	public void setOutgoingCalls(int outgoingCalls) {
		this.outgoingCalls = outgoingCalls;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nPhone number: " + this.phoneNumber;
	}

}
