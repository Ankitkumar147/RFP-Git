//Employee Wage Computation in Java
public class UC5MonthWage {

	public static void main(String[] args) {
		int isPartTime = 1;
		int isFullTime = 2;
		int wagePerHr = 20;
		int empHrs = 0;
		int totalEmpHrs = 0;
		int empWage = 0;
		int numOfWorkingDays = 20;
		// loop conditions
		for (int i = 0; i < numOfWorkingDays ; i++  ) {
				
				int empCheck = (int)Math.floor(Math.random()*10)%3;
					switch (empCheck) {
						case 1:
							empHrs = 4;
							break;
						case 2:
							empHrs = 8;
							break;
						default:
							empHrs = 0;
							break;
						}
						totalEmpHrs = totalEmpHrs+empHrs;
		}
					empWage = totalEmpHrs*wagePerHr;
			System.out.println("Employee Wage For the Month:- " + empWage);
		}			
	}


