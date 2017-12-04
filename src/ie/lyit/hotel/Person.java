package ie.lyit.hotel;

import java.io.Serializable;

/**
 * @author Pierre Brelaud L00142761
 * Person Class
 * BSC in Computing
 */
public abstract class Person implements Serializable {
	
	protected Name name;	// Protected pour utiliser dans la subclass
	protected String address;
	protected String phoneNumber;

	public Person() {
		// TODO Auto-generated constructor stub
		this.name = new Name();
		this.address = null;
		this.phoneNumber = null;
	}	

	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Person(Name name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	
	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "";
	}

	@Override
	public boolean equals(Object obj) {
		Person personObject;
		if(obj instanceof Person)
			personObject = (Person)obj;
		else
			return false;
		
		return(this.name.equals(personObject.name)
				&& this.address.equals(personObject.address)
				&& this.phoneNumber.equals(personObject.phoneNumber));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
