package com.bridgelabz.EmpWageBuilder;
public class EmpMonthWage {
    //constant
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHrsInMonth;
    // variable

    public EmpMonthWage(String company, int wagePerHour, int numOfWorkingDays, int maxHrsInMonth){
    this.company = company;
    this.wagePerHour = wagePerHour;
    this.numOfWorkingDays = numOfWorkingDays;
    this.maxHrsInMonth = maxHrsInMonth;
}

    //control Statements
    public void computeWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs < maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays += 0;
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
        int empWage = totalEmpHrs * wagePerHour;
        System.out.println("Employee Wage for the company "+company+" is :- Rs." + empWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program.");
        EmpMonthWage amazon = new EmpMonthWage("amazon", 20 , 20, 160);
        amazon.computeWage();
        EmpMonthWage BlueOcean = new EmpMonthWage("BlueOcean", 30 , 18, 160);
        BlueOcean.computeWage();
    }
}