/**
 * 
 */
package ie.lyit.hotel;

/**
 * @author Pierre Brelaud L00142761
 * Date Class
 * BSC in Computing
 */
public class Date {
	
	private int day;
	private int month;
	private int year;
	
	/**
	 * Date default constructor
	 */
	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	/**
	 * Date constructor
	 * @param day
	 * @param month
	 * @param year
	 * @throws IllegalArgumentException
	 */
	public Date(int day, int month, int year) throws IllegalArgumentException{
		if(day < 1 || day > 31)
			throw new IllegalArgumentException("Invalid day.");
		if(month < 1 || month > 12)
			throw new IllegalArgumentException("Invalid month.");
		if(year < 1900)
			throw new IllegalArgumentException("Invalid year.");
			
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * Month to set 
	 * Verification if the month is correct
	 * @param setMonth
	 * @throws IllegalArgumentException
	 */
	public void setMonth (int setMonth) throws IllegalArgumentException{
		if(setMonth < 1 || setMonth > 12)
			throw new IllegalArgumentException("Invalid month");
		month = setMonth;
	}
	
	/**
	 * @return current month
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * Year to set
	 * Verification if the year is correct
	 * @param setYear
	 * @throws IllegalArgumentException
	 */
	public void setYear (int setYear) throws IllegalArgumentException{
		if(setYear < 1900)
			throw new IllegalArgumentException("Invalid year.");
		year = setYear;
	}
	
	/**
	 * @return current month
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Day to set
	 * Verification if the day is correct
	 * @param setDay
	 * @throws IllegalArgumentException
	 */
	public void setDay (int setDay)  throws IllegalArgumentException{
		if(setDay < 1 || setDay > 31)
			throw new IllegalArgumentException("Invalid day.");
		day = setDay;
	}
	
	/**
	 * Current day
	 * @return
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * ToString method override from super class
	 */
	@Override
	public String toString() {
		return ( day + "/" + month + "/" + year);
	}
	
	/**
	 * Equals method override from super class
	 */
	@Override
	public boolean equals(Object obj) {
		Date dateObject;
		if(obj instanceof Date)
			dateObject = (Date)obj;
		else
			return false;
		
		return (this.day == dateObject.day
				&& this.month == dateObject.month
				&& this.year == dateObject.year);
	}

}
