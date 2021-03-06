public class Demo {

	public static void main(String[] args) {
		Phonebook pb = new Phonebook();
			
		System.out.println("Trying to add contancts with wrong numbers...\n");
		System.out.println(pb.addRecord("Sashko", "+359881344224", 2));		// '1' written on the wrong position
		System.out.println(pb.addRecord("Sashko", "+359826344444", 3));		// '2' written on the wrong position
		System.out.println(pb.addRecord("Sashko", "+3598833442221", 3));		// longer phone number
		System.out.println(pb.addRecord("Sashko", "+35988334422", 3));			// shorter phone number
		System.out.println(pb.addRecord("Sashko", "+08833442221", 3));			// wrong code before the number
		System.out.println(pb.addRecord("Sashko", "008833442221", 3));		//   --||--
		
		System.out.println("\nTrying to add contacts with correct phone numbers\n");
		
		System.out.println(pb.addRecord("Sashko", "+359883344222", 3));
		System.out.println(pb.addRecord("Petyr", "00359878334424", 3));
		
		System.out.println("\nPrinting PhoneBook\n");
		System.out.println(pb.printArr());
		
		System.out.println(pb.deleteRecord("Sashko"));
		System.out.println("\nPhoneBook After Deleting Sashko:\n");
		System.out.println(pb.printArr());
		
		System.out.println("Printing phone number for a specific contact (Aleksandyr)");
		System.out.println(pb.viewPhoneNumber("Aleksandyr"));
		
		System.out.println("\nPrinting the top Five phone Numbers with most outgoing calls:\n");
		System.out.println(pb.printTopFiveWithMostOutgoingCalls());
//...
	}
}