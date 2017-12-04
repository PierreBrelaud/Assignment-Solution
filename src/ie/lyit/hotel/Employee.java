package ie.lyit.hotel;

/**
 * @author Pierre Brelaud L00142761
 * Employee Class
 * BSC in Computing
 */
public class Employee extends Person implements Payable{

	private Date dateOfBirth;
	private Date startDate;
	private double salary;
	private int number;
	private static int nextNumber=1;	
	
	public Employee() {
		super();
		this.dateOfBirth = null;
		this.startDate = null;
		this.salary = 0;
		this.number = nextNumber++;
	}


	public Employee(Name name,String address, String phoneNumber, Date dateOfBirth, Date startDate, double salary) {
		super(name, address, phoneNumber);
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
		this.salary = salary;
		this.number = nextNumber++;
	}

	@Override
	public double calculateWage(double taxPercentage)	{
		return this.salary/12 - taxPercentage;
	}
	
	@Override
	public double incrementSalary(double incrementAmount)	{
		if(this.salary + incrementAmount <= 150000)
			return this.salary = this.salary + incrementAmount;
		else
			return this.salary = 150000;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [dateOfBirth=" + dateOfBirth + ", startDate=" + startDate + ", salary=" + salary + ", number="
				+ number + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee employeeObject;
		if(obj instanceof Employee)
			employeeObject = (Employee)obj;
		else
			return false;
		
		return (this.number == employeeObject.number);
	}
	


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


}
