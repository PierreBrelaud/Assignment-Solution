package ie.lyit.serialize;

import ie.lyit.hotel.Customer;

public interface CustomerSerializerDAO {

	/**
	 * Method to get the next customer number
	 * Permit to get the next customer number
	 * when we close the file who store the customers
	 * @return next customer number
	 */
	int nextCustomerNumber();

	/**
	 * Method to add a customer
	 */
	void add();

	/**
	 * List of all customers
	 */
	void list();

	/**
	 * View customer method 
	 * Display customer after the user entry the number
	 * @return Customer
	 */
	Customer view();

	/**
	 * Delete customer method
	 */
	void delete();

	/**
	 * Edit customer method
	 */
	void edit();

	/**
	 * WriteRecordsFile method
	 * Store the customers list into a file
	 */
	void writeRecordsToFile();

	/**
	 * ReadRecordsFromFile method
	 * Read the customers stored in the file
	 */
	void readRecordsFromFile();

}