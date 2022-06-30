package com.Bridgelabz.UC;

public class UC3PartTime {

	public static void main(String[] args) {
		int isPartTime = 1 , isFullTime = 2;
		int wagePerHour = 20;
		//variables
		int empHrs	= 0 , empDailyWage = 0;	
		double empCheck = Math.floor(Math.random()*10 % 3);
		
			if  ( empCheck == isPartTime ) {
				empHrs = 4;
				empDailyWage = (empHrs*wagePerHour);
				System.out.println("Employee is Present Part Time with daily Wage :- "+ empDailyWage );
			}	
			else if (empCheck == isFullTime ) {
				empHrs = 8;
				empDailyWage = (empHrs*wagePerHour);
				System.out.println("Employee is Present Full Time with daily Wage :- "+ empDailyWage );
			}		
				else {
				empHrs=0;
	         	System.out.println("Employe is Absent with daily wage:-" + empDailyWage );
				}
		}

	}

