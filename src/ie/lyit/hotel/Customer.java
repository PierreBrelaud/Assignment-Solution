package ie.lyit.hotel;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ie.lyit.hotel.Customer;
import ie.lyit.hotel.Name;

/**
 * @author Pierre Brelaud L00142761
 * Customer Class
 * BSC in Computing
 */
public class Customer extends Person{
	
	private String email;
	private int number;
	private static int nextNumber=1;
	
	/**
	 * Customer default constructor
	 */
	public Customer() {
		super();
		this.email = null;
		this.number = nextNumber++;
	}
	
	/**
	 * Customer constructor
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * @param email
	 */
	public Customer(Name name, String address, String phoneNumber, String email) {
		super(name, address, phoneNumber);
		this.email = email;
		this.number = nextNumber++;
	}

	/**
	 * Equals method override from super class
	 */
	@Override
	public boolean equals(Object obj) {
		Customer customerObject;
		if(obj instanceof Customer)
			customerObject = (Customer)obj;
		else
			return false;
		
		return (this.number == customerObject.number);
	}
	
	/**
	 * @return current email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * email to set
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return current number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Method used to set the number when a new Customer is added
	 * @param number (calculated from another method : highest customer number + 1)
	 */
	public static void setNumber(int number) {
		Customer.nextNumber = number;
	}

	/**
	 * ToString method override from super class
	 */
	@Override
	public String toString() {
		return super.toString() + ", email= " + email + "Number : "+ number;
	}


	
	/**
	 * Read function : Allow the user to read a customer
	 */
	public void read(){
		//Creation of text fields used by the user to create a new Customer
		JTextField title = new JTextField();
		JTextField firstname = new JTextField();
		JTextField surname = new JTextField();
		JTextField address = new JTextField();
		JTextField phoneNumber = new JTextField();
		JTextField email = new JTextField();

		//Message display for the user
	    Object[] message = {
	    	"Title : ", title, "Firstname : ", firstname, "Surname : ", surname,"Address : ", address,
	    	"Phone number : ", phoneNumber,"E-Mail : ", email,
	     };
	
	    //Title and type of the window displayed
	    int option = JOptionPane.showConfirmDialog(	null, message, "Enter customer details", JOptionPane.DEFAULT_OPTION);
	
	    //Creation of a new customer when the user click on "OK"
	    if (option == JOptionPane.OK_OPTION) {
	    	Name n = new Name(title.getText(), firstname.getText(), surname.getText());
	    	this.name = n;
	    	this.address = address.getText();
	    	this.phoneNumber = phoneNumber.getText();
	    	this.email = email.getText();
	    }   
	}
	

}
