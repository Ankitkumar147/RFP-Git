package com.bridgelabz.EmpWageBuilder;
public class EmpWageUC6 {
    //constant
    public static final int wagePerHr = 20;
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int numOfWorkingDays = 20;
    public static final int maxHrsinMonth = 100;
    // variable
    public static void main (String[]args) {
     int empHrs = 0;
     int empWage;
     int totalWorkingDays = 0;
     int totalEmpHrs = 0;
     //control Statements
        while ( totalEmpHrs < maxHrsinMonth && totalWorkingDays < numOfWorkingDays )
        {
            totalWorkingDays += 0;
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);
            switch(empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    break;
            }
            totalEmpHrs = totalEmpHrs+empHrs;
        }
        empWage = totalEmpHrs*wagePerHr;
        System.out.println("Employee Wage for te the month is :- "+empWage );
    }
}
