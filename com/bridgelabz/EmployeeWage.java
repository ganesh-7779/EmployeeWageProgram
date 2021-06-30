
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
	
/**
 * @employeeCheckAndDailyWage is a method for UC1 And UC2 "Check Employee is Present or Absent" And "Calculate Daily Wage".
 */
	
public void employeeCheckAndDailyWage() {
	int IS_FULL_TIME = 1;
	double empCheck= Math.floor(Math.random()*10)%2;
	if ( empCheck == IS_FULL_TIME ){
		
	System.out.println("Employee is present");
	int empDailyWage = wagePerHrs*fullDayHrs;
	System.out.println("Employee Daily Wage :"+empDailyWage);
	}
	else{
	System.out.println("Employee is absent,No Daily Wage");
	} 
}
/**
 * @param args is main method of class
 */

public static void main(String[] args) {
	
System.out.println("Welcome To Employee Wage Computation Program");
		EmployeeWage attendance = new EmployeeWage(); // Object of main class
		attendance.employeeCheckAndDailyWage();  //invoke @employeeCheckAndDailyWage method though main class object.
}
}