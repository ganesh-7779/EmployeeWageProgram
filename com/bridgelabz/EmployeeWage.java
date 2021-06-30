
/****************************************************************
 * Purpose : Implementation Of Employee Wage Computation Problem
 * @author Ganesh Gavhad
 * @version 1.0
 ****************************************************************/
package com.bridgelabz;

/**
 * @EmployeeEage is a main class of Program.
 **/

public class EmployeeWage {
	int wagePerHrs = 20;
	int fullDayHrs = 8;
	int partTimeHrs = 4;
	int fulltime = 2;
	int parttime = 1;
	int empDailyWage;
	int dayPerMonth = 20;                       // Assuming 20 Working Day Per Month

/**
 * @employeeCheckAndDailyWage is a method for UC5 Calculating Employee Wage By Using Switch Case For Month ".
 **/
	
public void employeeCheckAndDailyWage() {
	
	int empCheck= (int) Math.floor(Math.random()*10)%3;
	switch (empCheck) {	
	
case 2 :                                        // full Time daily Wage calculation For Month
	System.out.println("Employee is present");
	int empDailyWage = wagePerHrs*fullDayHrs*dayPerMonth;
	System.out.println("Employee Daily Wage :"+empDailyWage);
	break;
	
case 1 :                         				//part time wage calculation Added for Month
		System.out.println("Employee is present in Part Time");
		int empPartTimeWage = wagePerHrs*partTimeHrs*dayPerMonth;
		System.out.println("Employee Part Time Wage :"+empPartTimeWage);
	break;
	
case 0 : 										// Employee is Absent
	System.out.println("Employee is absent,No Daily Wage");
	break;
	} 
}

/**
 * @param args is main method of class
 */

public static void main(String[] args) {
	
System.out.println("Welcome To Employee Wage Computation Program");
		EmployeeWage attendance = new EmployeeWage(); // Object of main class
		attendance.employeeCheckAndDailyWage();       //invoke @employeeCheckAndDailyWage method though main class object.
}
}