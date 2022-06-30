
public class uc4UsingCaseEmpWage {

	public static void main(String[]args) {
		int isPartTime = 1 ,isFullTime = 2 ;   
		int wagePerHour = 20;
		int empHrs , empDailyWage = 0;	
		int empCheck = (int) Math.floor(Math.random()*10 % 3);
		switch (empCheck)  
		{ 
			case 1: 
					empHrs = 4;
					empDailyWage = (empHrs*wagePerHour);
				    System.out.println("Employee is Present with daily Wage :- "+ empDailyWage );
			break;
			case 2:
				
					empHrs = 8;
					empDailyWage = (empHrs*wagePerHour);
					System.out.println("Employee is Present with daily Wage :- "+ empDailyWage );
			break;
			default:
					empHrs=0;
	         		System.out.println("Employe is Absent with daily wage:-" + empDailyWage );
			break;
		}
	    System.out.println("Random number generated here is :- "+ empCheck);
	}
}
