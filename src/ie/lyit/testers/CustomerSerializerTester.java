package ie.lyit.testers;

import java.util.Scanner;

import ie.lyit.serialize.CustomerSerializer;

public class CustomerSerializerTester {

	public static void main(String[] args) {
		CustomerSerializer customerSerializer = new CustomerSerializer();
/*
		// Add two records to the ArrayList
		customerSerializer.add();
		// customerSerializer.add();

		// List Customers
		customerSerializer.list();

		// Write the ArrayList to File
		customerSerializer.writeRecordsToFile();
*/
		/*
		 * // Read the ArrayList from the File customerSerializer.readRecordsFromFile();
		 * 
		 * // List all the books in the ArrayList customerSerializer.list();
		 */

		char select;
		String input;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("enter choice\n"
				+ "Press 1 to Add user\n"
				+ "Press 2 to list user\n"
				+ "Press 3 to edit user\n"
				+ "Press 4 to delete user\n"
				+ "Press 5 to write records to file\n"
				+ "Press 6 to read records from file");

		input = keyboard.nextLine();

		select = input.charAt(0);

		switch (select) {
		case '1':
			System.out.println("Add user \n");
			// Add two records to the ArrayList
			customerSerializer.add();
			break;
		case '2':
			System.out.println("List user \n");
			customerSerializer.list();
			break;
		case '3':
			System.out.println("");
			break;
		case '4':
			System.out.println("");
			break;
		case '5':
			System.out.println("Write records to file");
			customerSerializer.writeRecordsToFile();
			break;
		case '6':
			System.out.println("Read records from file");
			customerSerializer.readRecordsFromFile();
			break;
		default:
			System.out.println("Invalid choice inputted");
			break;
		}
		keyboard.close();
	}
}
