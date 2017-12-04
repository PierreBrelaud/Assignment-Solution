package ie.lyit.testers;


import ie.lyit.hotel.Customer;
import ie.lyit.hotel.Menu;
import ie.lyit.serialize.CustomerSerializer;

/**
 * @author Pierre Brelaud L00142761
 * CustomerSerializerTester Class
 * BSC in Computing
 */
public class CustomerSerializerTester {

	public static void main(String[] args) {
		
		//Open and read the file with all customers
		CustomerSerializer customerSerializer = new CustomerSerializer();
		customerSerializer.readRecordsFromFile();
		Customer.setNumber(customerSerializer.nextCustomerNumber() + 1);	
		
	    // Create a menu from the Menu class
		Menu menuObj = new Menu();
		
		do {
			//We display the menu and allow the user to select a number
			menuObj.display();
			menuObj.readOption();
	
			// After the user entry we call the method wanted
			switch(menuObj.getOption()){
			   case 1:customerSerializer.add();
			   			break;
			   case 2:customerSerializer.list();
			   			break;
			   case 3:customerSerializer.view();
			   			break;
			   case 4:customerSerializer.edit();
			   			break;
			   case 5:customerSerializer.delete();
			   			break;
			   case 6:break;				
			   default:
				   System.out.println("Number between 1 and 6");
			}
			//If the number is 6 we leave the program
		} while(menuObj.getOption() != 6);
		
		//Write customers list into the file at then end of the execution
		customerSerializer.writeRecordsToFile();
}
}
