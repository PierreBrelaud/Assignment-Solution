package ie.lyit.serialize;													
import java.io.FileInputStream;								
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import ie.lyit.hotel.Customer;

/**
 * @author Pierre Brelaud L00142761
 * CustomerSerializer Class
 * BSC in Computing
 */			
public class CustomerSerializer implements CustomerSerializerDAO 
	{
		//ArrayList to contain customers
		private ArrayList<Customer> customers; 		
		//File where customers will be stored 
		final String FILENAME = "customers.ser";
	
		public ArrayList<Customer> getCustomers(){
			return customers;
		}
	/**
	 * Default constructor
	 */
	public CustomerSerializer()								
	{						
		customers = new ArrayList<Customer>();		
	}
	
	/* (non-Javadoc)
	 * @see ie.lyit.serialize.CustomerSerializerDAO#nextCustomerNumber()
	 */
	@Override
	public int nextCustomerNumber()	{
		int number = 0;		
		//Loop on customers list 
		//If the number of current customer is > to the number
		//he become the number
		//Add the end of the loop we have the highest customer number
		for(Customer c:customers)	{	
			if (c.getNumber() >number)
				number = c.getNumber();
		}
		return number;
	}
	
	/* (non-Javadoc)
	 * @see ie.lyit.serialize.CustomerSerializerDAO#add()
	 */
	@Override
	public void add(){
		//Create a new Customer
		Customer customer = new Customer();
		//Add values of the customer after user entry
		customer.read();	
		//Add the customer to the list of customers
		customers.add(customer);
	}


	/* (non-Javadoc)
	 * @see ie.lyit.serialize.CustomerSerializerDAO#list()
	 */
	@Override
	public void list(){
		//Loop on the customer list and display all customers
        for(Customer c:customers)
			System.out.println(c);
	}	
	

	/* (non-Javadoc)
	 * @see ie.lyit.serialize.CustomerSerializerDAO#view()
	 */
	@Override
	public Customer view(){
		
		Scanner keyboard = new Scanner(System.in);		

		// Customer number from user entry
		System.out.println("Customer number : ");
		int customerNumber = keyboard.nextInt();
		
		// Loop in customer list
		// If customer number correspond to a customer
		// Return the customer else return Null
        for(Customer c:customers) {
 		   if(c.getNumber() == customerNumber){
 			  System.out.println(c);
 			  return c;
 		   }
        }
	    return null;		
	}
	

	/* (non-Javadoc)
	 * @see ie.lyit.serialize.CustomerSerializerDAO#delete()
	 */
	@Override
	public void delete(){	
		//Use the view method to select a customer
		//If the customer exist we delete it
		Customer c = view();
	    if(c != null)
	    	customers.remove(c);		
	}


	/* (non-Javadoc)
	 * @see ie.lyit.serialize.CustomerSerializerDAO#edit()
	 */
	@Override
	public void edit(){	
		//Use the view method to select a customer
		//If the customer exist we get his index 
		//Use the method read to update the values
		//And update it in the list
		Customer c = view();
	    if(c != null){
		   int number = customers.indexOf(c);
		   c.read();
		   customers.set(number, c);
	    }
	}
	
	
	/* (non-Javadoc)
	 * @see ie.lyit.serialize.CustomerSerializerDAO#writeRecordsToFile()
	 */
	@Override
	public void writeRecordsToFile() {	
		try {										
			FileOutputStream fileStream = new FileOutputStream(FILENAME);
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(customers);
			os.close();
		}
		catch(FileNotFoundException fNFE) {
			System.out.println("Error with file");		
		}
		
		catch(IOException ioE) 	{
			System.out.println(ioE.getMessage());
		}
	}
	
	/* (non-Javadoc)
	 * @see ie.lyit.serialize.CustomerSerializerDAO#readRecordsFromFile()
	 */
	@Override
	public void readRecordsFromFile() {
		try {													
			FileInputStream fileStream = new FileInputStream(FILENAME);
			ObjectInputStream is = new ObjectInputStream(fileStream);
			customers = (ArrayList<Customer>)is.readObject();
			is.close();
		}
		
		catch(FileNotFoundException fNFE) {													
			System.out.println("Error with file");	
		}
		
		catch(IOException ioE) {
			System.out.println(ioE.getMessage());
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
