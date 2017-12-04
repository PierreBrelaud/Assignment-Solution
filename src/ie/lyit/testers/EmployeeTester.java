package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.hotel.Date;
import ie.lyit.hotel.Employee;
import ie.lyit.hotel.Name;

/**
 * @author Pierre Brelaud L00142761
 * EmployeeTester Class
 * BSC in Computing
 */
public class EmployeeTester {

	public EmployeeTester() {
		// TODO Auto-generated constructor stub
	}

	public static boolean employeeSearch(ArrayList<Employee> list, Employee e) {
		if(list.contains(e))
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {

		Name n1 = new Name("Mr","Jean","Valjean");
		Date birth = new Date(1996,01,01);
		Date start = new Date(2006,01,01);

		Employee e1 = new Employee(n1, "Rue de Jean Valjean", "+33689084554",birth,start,(double)2001);
		Employee e2 = new Employee(n1, "Rue de Jean Valjean", "+33689084554",birth,start,(double)2002);
		Employee e3 = new Employee(n1, "Rue de Jean Valjean", "+33689084554",birth,start,(double)2003);
		Employee e4 = new Employee(n1, "Rue de Jean Valjean", "+33689084554",birth,start,(double)2004);
		
		Employee e5 = new Employee(n1, "Rue de Jean Valjean", "+33689084554",birth,start,(double)2005);

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		if(e1.equals(e2))
			System.out.println("Equals");
		else
			System.out.println("Not Equals");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		for (Employee e: employees)	{
			System.out.println(e.toString());
		}
		
		if(employeeSearch(employees, e5))
			System.out.println("In");
		else
			System.out.println("Out");
			
		
	
		
		
	}

}
