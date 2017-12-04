/**
 * 
 */
package ie.lyit.testers;

import javax.swing.JOptionPane;

import ie.lyit.hotel.Date;

/**
 * @author Pierre Brelaud L00142761
 * DateTester Class
 * BSC in Computing
 */
public class DateTester {

	/**
	 * 
	 */
	public DateTester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(1,1,2017);
		Date d2 = new Date(1,1,2017);
		Date d3 = new Date(2,1,2017);
		
		System.out.println(d1.toString() + "\n" + d2.toString() + "\n" + d3.toString());
		
		if(d1.equals(d2))
			System.out.println(d1 + " == " + d2);
		else
			System.out.println(d1 + " != " + d2);
			

		if(d1.equals(d3))
			System.out.println(d1 + " == " + d3);
		else
			System.out.println(d1 + " != " + d3);
		
		//Test exceptions setters
		boolean goodDate = false;
		int firstTry = 0;
		do {
			try {
				int enterDay;
				int enterMonth;
				int enterYear;
				Date testException1 = new Date();
				
				if(firstTry != 0)
				{
					enterDay = Integer.parseInt(JOptionPane.showInputDialog(null, "Day"));
					enterMonth = Integer.parseInt(JOptionPane.showInputDialog(null, "Month"));
					enterYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Year"));
				}
				else	{
					enterDay = 10;
					enterMonth = 10;
					enterYear = 2000;
				}
					
				testException1.setDay(enterDay);
				testException1.setMonth(enterMonth);
				testException1.setYear(enterYear);
				goodDate = true;
			}
			catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e);
			}
			firstTry++;
		}while (!goodDate);
		
		//Test exceptions constructor
		boolean goodDate2 = false;
		int firstTry2 = 0;
		do {
			try {
				int enterDay;
				int enterMonth;
				int enterYear;
				
				if(firstTry2 != 0)
				{
					enterDay = Integer.parseInt(JOptionPane.showInputDialog(null, "Day"));
					enterMonth = Integer.parseInt(JOptionPane.showInputDialog(null, "Month"));
					enterYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Year"));
				}
				else	{
					enterDay = 0;
					enterMonth = 0;
					enterYear = 0;
				}
					
				Date testException2 = new Date(enterDay,enterMonth,enterYear);
				goodDate2 = true;
			}
			catch (IllegalArgumentException e){
				JOptionPane.showMessageDialog(null, e);
			}
			firstTry2++;
		} while(!goodDate2);
	}

}
