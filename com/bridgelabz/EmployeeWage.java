
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
	
/**
 * @employeeCheck is a method for UC1 "Check Employee is Present or Absent".
 */
	
public void employeeCheck() {
	int IS_FULL_TIME = 1;
	double empCheck= Math.floor(Math.random()*10)%2;
	if ( empCheck == IS_FULL_TIME ){
		
	System.out.println("Employee is present");
	}
	else{
	System.out.println("Employee is absent");
	} 
}

/**
 * @param args is main method of class
 */

public static void main(String[] args) {
	
System.out.println("Welcome To Employee Wage Computation Program");
		EmployeeWage attendance = new EmployeeWage(); // Object of main class
		attendance.employeeCheck();  //invoke employeeCheck method though main class object.
	}
}