package ie.lyit.testers;


import ie.lyit.hotel.Customer;
import ie.lyit.hotel.Name;

/**
 * @author Pierre Brelaud L00142761
 * CustomerTester Class
 * BSC in Computing
 */
public class CustomerTester {

	public CustomerTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Name n1 = new Name("Mr","Jean","Valjean");
		Customer c1 = new Customer(n1,"Rue de Jean Valjean", "+33689084554", "jeanvaljean@gmail.com");;
		Customer c2 = new Customer(n1,"Rue de Jean Valjean", "+33689084554", "jeanvaljean@gmail.com");

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		if(c1.equals(c2))
			System.out.println("Equals");
		else
			System.out.println("Not Equals");
	}

}
