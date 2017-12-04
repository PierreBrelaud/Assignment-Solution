/**
 * 
 */
package ie.lyit.hotel;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Pierre Brelaud L00142761
 * Name Class
 * BSC in Computing
 */
public class Name implements Serializable{
	
	private String title;
	private String firstName;
	private String surName;

	public void setTitle (String setTitleTo) {
		title = setTitleTo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setFirstName (String setFirstName) {
		firstName = setFirstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setSurName (String setSurName) {
		surName = setSurName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	/**
	 * default constructor
	 */
	public Name() {
		this.title = null;
		this.firstName = null;
		this.surName = null;
	}
	
	/**
	 * initialization constructor
	 * @param title
	 * @param firstName
	 * @param surName
	 */
	public Name (String title, String firstName, String surName)	{
		this.title = title;
		this.firstName = firstName;
		this.surName = surName;		
	}
	
	public String toString() {
		return ("title= " + title + ", firstname=" + firstName + "surname= " + surName + "");
	}
	
	@Override
	public boolean equals(Object obj) {
		Name nameObject;
		if(obj instanceof Name)
			nameObject = (Name)obj;
		else
			return false;
		
		return (this.title.equals(nameObject.title)
				&& this.firstName.equals(nameObject.firstName)
				&& this.surName.equals(nameObject.surName));
	}

	public boolean isFemale() {
		String[] titleList = {"Miss", "Ms", "Mrs"};
		
		if(Arrays.asList(titleList).contains(this.title)) 
			return true;
		else
			return false;
			
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
