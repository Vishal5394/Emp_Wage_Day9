package com.BridgeLabz.day9;

	public class Emp_Wage_Day9 {
		

		static final int Is_Present = 1;
		static final int Is_PartTime = 2;
		static int Emp_wage_per_hr = 20;
		static int No_Of_Working_Days = 20;

		void  Welcome(){
			System.out.println("Welcome to Employee Wage Computation Program"); 
		}
		void getMonthlyWage() {
			int  Employeehr = 0 , Daily_Wage = 0, Total_Wage = 0;
			
			int Attendance = (int)Math.floor(Math.random()*10)%3;
			
			switch (Attendance) {
			 case Is_Present:
				Employeehr = 8;
					System.out.println("Employee is Present ");
					break;
			
			case Is_PartTime :
				Employeehr = 4;
				 System.out.println("Employee is Present Part Time ");
				 break;
				 
			default:
				Employeehr = 0;
			System.out.println("Employee is Absent ");
			break;
			}
				
			Daily_Wage = Emp_wage_per_hr  *Employeehr;
			Total_Wage = Daily_Wage * No_Of_Working_Days;
			
			System.out.println("Employee Daily Wage is = "+Daily_Wage);
			System.out.println("Employee Monthly Total Wage is = "+Total_Wage);
		}

		public static void main(String[] args) {
			Emp_Wage_Day9 obj = new Emp_Wage_Day9();
			obj.Welcome();
			obj.getMonthlyWage();

		}
	}
	
