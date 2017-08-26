
public interface IMap {
	public String addRecord(String name, String phNumber, int outgoingCalls);
	public String deleteRecord(String name);
	public String viewPhoneNumber(String name);
	public String printArr();
	public String printTopFiveWithMostOutgoingCalls();
}
