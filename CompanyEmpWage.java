package com.BridgeLabz.day9;


public class CompanyEmpWage {
	static final int Is_Present = 1;
	static final int Is_PartTime = 2;
	

	void  Welcome(){
		System.out.println("Welcome to Employee Wage Computation Program"); 
	}
	
	public static void calcEmpWageForCompany(String Company, int empRate, int numOfDays, int maxHrs) {
		int empHrs=0, totalEmpHrs=0, totalWorkongDays = 0;
		

	while( totalEmpHrs <= maxHrs && totalWorkongDays <= numOfDays ) {
		totalWorkongDays++;
		int Attendance = (int)Math.floor(Math.random()*10)%3;
	
	switch (Attendance) {
	 case Is_Present:
		 empHrs = 8;
			System.out.println("Employee is Present ");
			break;
	
	case Is_PartTime :
		empHrs = 4;
		 System.out.println("Employee is Present Part Time ");
		 break;
		 
	default:
		empHrs = 0;
	System.out.println("Employee is Absent ");
	break;
	}
	
	totalEmpHrs += empHrs;
	System.out.println("Day#: "+ totalWorkongDays+"Emp Hr: "+ empHrs );
	int Daily_Wage = empRate  *empHrs;
	System.out.println("Employee Daily Wage is = "+Daily_Wage);
	int Total_Wage = Daily_Wage * numOfDays;
	System.out.println("Employee Monthly Total Wage for company = "+Company+" is "+Total_Wage);
	return;
	
	
	}
}
public static void main(String[] args) {
	calcEmpWageForCompany ("Vijay Sales",20,20,10);
	calcEmpWageForCompany ("TCS",10,25,20);
	

}
}

