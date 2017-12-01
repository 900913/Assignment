package ie.lyit.serialize;

import java.util.ArrayList;
import ie.lyit.hotel.Customer;
import java.io.*;

public class CustomerSerializer {
	private ArrayList<Customer> customers;
	
	//Filename for serialize data output 
	private final String FILENAME = "customers.ser";
	
	//Default Constructor
	public CustomerSerializer(){
		//Construct customers ArrayList
		customers = new ArrayList<Customer>();
	}
	
	public void add(){
		//Create a Customer object
		Customer customer = new Customer();
		//Read its details
		customer.read();
		//Add it to the customers ArrayList
		customers.add(customer);
	}
	
	public void list(){
		//for every Customer object in customers
		for(Customer tmpCustomer:customers)
			//print to console
			System.out.println(tmpCustomer);
	}
	
	//Method to serialize/write customers ArrayList to file called
	//customers.ser and preform error checking
	public void writeRecordsToFile(){
		ObjectOutputStream os=null;
		try {
			// Serialize the ArrayList...
			FileOutputStream fileStream = new FileOutputStream(FILENAME);
		
			os = new ObjectOutputStream(fileStream);
				
			os.writeObject(customers);
		}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException ioE){
			System.out.println(ioE.getMessage());
		}
		finally {
			try {
				os.close();
			}
			catch(IOException ioE){
				System.out.println(ioE.getMessage());
			}
		}
	}
	
	//Method to deserialize/restore customers ArrayList to file called
	//customers.ser and preform error checking
	public void readRecordsFromFile(){
		ObjectInputStream is=null;
		
		try {
			// Deserialize the ArrayList...
			FileInputStream fileStream = new FileInputStream(FILENAME);
		
			is = new ObjectInputStream(fileStream);
				
			customers = (ArrayList<Customer>)is.readObject();	
		}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException ioE){
			System.out.println(ioE.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			try {
				is.close();
			}
			catch(IOException ioE){
				System.out.println(ioE.getMessage());
			}
		}
	}
	
}
