package com.BridgeLabz.day9;

	public class Emp_Wage_Day9 {

		static int Is_Present = 1;
		static int Emp_wage_per_hr = 20;

		void  Welcome(){
			System.out.println("Welcome to Employee Wage Computation Program"); 
		}
		void Daily_Wage() {
			int  Employeehr = 0 , Daily_Wage = 0;
			
			double Attendance = Math.floor(Math.random()*10)%2;
			
			if (Attendance == Is_Present) {
				Employeehr = 8;
			System.out.println("Employee is Present ");
			}
			else {
				Employeehr = 0;
			System.out.println("Employee is Absent ");
			}
				
			Daily_Wage = Emp_wage_per_hr  *Employeehr;
			
			System.out.println("Employee Daily Wage is = "+Daily_Wage);
		}

		public static void main(String[] args) {
			Emp_Wage_Day9 obj = new Emp_Wage_Day9();
			obj.Welcome();
			obj.Daily_Wage();

		}
	}
	
