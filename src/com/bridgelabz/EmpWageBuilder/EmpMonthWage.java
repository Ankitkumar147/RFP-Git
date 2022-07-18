package com.bridgelabz.EmpWageBuilder;
public class EmpMonthWage {
    //constant
    public static final int WAGE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    // variable
    public static int empHrs = 0;
    public static int totalWorkingDays = 0;
    public static int totalEmpHrs = 0;
    //control Statements
    private static void computeWage() {
        while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            //totalWorkingDays += 0;
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    break;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        int empWage = totalEmpHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage for the month is :- Rs." + empWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program.");
        computeWage();
    }
}