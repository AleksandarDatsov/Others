
public class Demo {

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
			
		System.out.println("\nTrying to add contancts with wrong numbers...\n");
		pb.addRecord("Sashko", "+359881344224");		// '1' written on the wrong position
		pb.addRecord("Sashko", "+359826344444");		// '2' written on the wrong position
		pb.addRecord("Sashko", "+3598833442221");		// longer phone number
		pb.addRecord("Sashko", "+35988334422");			// shorter phone number
		pb.addRecord("Sashko", "+08833442221");			// wrong code before the number
		pb.addRecord("Sashko", "008833442221");		//   --||--
		
		System.out.println("\nTrying to add contacts with correct phone numbers\n");
		
		pb.addRecord("Sashko", "+359883344222");
		pb.addRecord("Petyr", "00359878334424");
		
		System.out.println("\nPrinting PhoneBook\n");
		pb.printArr();
		
		pb.deleteRecord("Sashko");
		System.out.println("\nPhoneBook After Deleting Sashko:\n");
		pb.printArr();
		
		System.out.println("Printing phone number for a specific contact (Aleksandyr)");
		pb.viewPhoneNumber("Aleksandyr");
	}
}
