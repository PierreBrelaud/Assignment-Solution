package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.hotel.Name;

/**
 * @author Pierre Brelaud L00142761
 * NameTester Class
 * BSC in Computing
 */
public class NameTester {

	public NameTester() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean nameSearch(Name name, ArrayList<Name> names)	{
		if(names.contains(name))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Name n = new Name();
		Name n1 = new Name("Mr","Pierre","Brelaud");
		Name n2 = new Name("Mr","Pierre","Brelaud");
		Name n3 = new Name("Mr", "Pierre2","Brelaud");
		//System.out.println(n.toString() + n1.toString());
		
		//Test Equals
		/*if(n1.equals(n2))
			System.out.println("same");
		else
			System.out.println("different");
		*/
	
		//Test isFemale()
		/*if(n1.isFemale() == true) 
			System.out.println("Yep");
		else 
			System.out.println("Nop");
		*/
		
		//ArrayList
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(n);
		names.add(n1);
		names.add(n2);
		
		for(Name displayName : names) {
			System.out.println(displayName.toString());
		}
		
		//Test nameSearch
		if(nameSearch(n3,names) == true)
			System.out.println("True");
		else
			System.out.println("false");
	}

}
