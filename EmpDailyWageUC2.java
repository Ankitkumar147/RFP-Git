
public class EmpDailyWageUC2 {
	public static void main(String[]args) {
		int isFullTime = 1;
		int wagePerHour = 20;
		int empHrs	= 0 , empDailyWage = 0;	
		double empCheck = Math.floor(Math.random()*10 % 2);
		if (empCheck == isFullTime ) {
			empHrs = 8;
			empDailyWage = (empHrs*wagePerHour);
			System.out.println("Employee is Present with daily Wage :- "+ empDailyWage );
		}
		else {
			System.out.println("Employe is Absent with daily wage:-" + empDailyWage );
		}
	}
}

