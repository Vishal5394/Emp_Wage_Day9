package com.BridgeLabz.day9;

	public class Emp_Wage_Day9 {

		void  Welcome(){
			System.out.println("Welcome to Employee Wage Computation Program");
		}
		void Attendance() {
			int Is_Present = 1;
			double Attendance = Math.floor(Math.random()*10)%2;
			
			if (Attendance == Is_Present)
			System.out.println("Employee is Present");
			
			else
				System.out.println("Employee is absent");
		}

		public static void main(String[] args) {
			Emp_Wage_Day9 obj = new Emp_Wage_Day9();
			obj.Welcome();
			obj.Attendance();
		}

	}
	
