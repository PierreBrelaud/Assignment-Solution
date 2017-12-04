package ie.lyit.hotel;

import java.util.Scanner;

/**
 * @author Pierre Brelaud L00142761
 * Menu Class
 * BSC in Computing
 */
public class Menu {
	private int option;
	
	public Menu() {
		option=0;
	}
	
    public void display(){
       System.out.println("\t1. Add");
	   System.out.println("\t2. List");
	   System.out.println("\t3. View");
	   System.out.println("\t4. Edit");
	   System.out.println("\t5. Delete");
	   System.out.println("\t6. Quit");		
	}

    public void readOption(){
        Scanner number = new Scanner(System.in);
    	System.out.println("\n\tEnter Option");
     	option=number.nextInt();
    }
    
	public int getOption(){
	   return option;
	}	    
}
