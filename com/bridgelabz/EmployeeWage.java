
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
	
/**
 * @employeeCheckAndDailyWage is a method for UC1 And UC2 , UC4 "Check Employee is Present or Absent" And "Calculate Daily And Part TimeWage".
 */
	
public void employeeCheckAndDailyWage() {
	
	double empCheck= Math.floor(Math.random()*10)%3;
	
	if ( empCheck == fulltime ){					// full Time daily Wage calculation
	System.out.println("Employee is present");
	int empDailyWage = wagePerHrs*fullDayHrs;
	System.out.println("Employee Daily Wage :"+empDailyWage);
	}
	
	else if (empCheck == parttime ){                        //part time wage calculation Added
		System.out.println("Employee is present in Part Time");
		int empDailyWage = wagePerHrs*partTimeHrs;
		System.out.println("Employee Part Time Wage :"+empDailyWage);
	}
	
	else if (empCheck==0){						// Employee is Absent
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