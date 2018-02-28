
package pay;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        	
                int level,  pay = 0, hours, extrahours = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Choose your skill level: 1, 2, 3.");
		level = in.nextInt();
                	
		switch (level) {
		case 1:
			pay = 17;
			break;
		case 2:
			pay = 20;
			break;
		case 3:
			pay = 22;
			break;
		default:
			System.out.println("Invalid skill level.");
		}

		
		if (level >=1 && level <=3) {
			System.out.println("Enter the hours you worked: ");
			hours = in.nextInt();
			
			if (hours > 40) {
				extrahours = hours - 40;
				hours = 40;
			}

			
			double rpay = hours * pay;
			double opay = extrahours * pay * 1.5;
			Integer  totalHours = hours + extrahours;
			double totalPay = rpay + opay;

			
			final double medicalInsurance = 32.5;
			final int dentalInsurance = 20;
			final int longTermDisability = 10;
			double retirementPlan = totalPay * .03;
			double itemizedDeductions = 0;
			int opcion=0;
			int numSelections = 0;
			if (level == 2 || level == 3) {
				do {
					System.out.println("Enter a opcion 1) medical insurance\n 2) dental insurance\n 3) long term disability insurance\n 0.- Exit");
					opcion = in.nextInt();
					numSelections++;
					if (opcion == 1) {
						itemizedDeductions += medicalInsurance;
						System.out.println("You have added medical insurance.");
					} else if (opcion == 2) {
						itemizedDeductions += dentalInsurance;
						System.out.println("You have added dental insurance.");
					} else if (opcion == 3) {
						itemizedDeductions += longTermDisability;
						System.out.println("You have added long term disability insurance.");
					} else {
                                            opcion =0;
					}
				} while (opcion != 0 && numSelections < 3);
			}
			if (level == 3) {
				System.out.println("Would you like to participate in the retirement plan? 1) Yes 2) No");
				int retirementYesNo = in.nextInt();
				if (retirementYesNo == 1) {
					itemizedDeductions += retirementPlan;
					System.out.println("You have chosen to participate in the retirement plan.");
				} else {
					System.out.println("You have chose not to participate in the retirement plan.");
				}

			}

			double netPay = totalPay - itemizedDeductions;

			
			System.out.println("Hours worked: " + totalHours);
			System.out.println("Hourly pay rate: $" + pay);
			System.out.println("Regular pay for 40 hours: $" + rpay);
			System.out.println("Overtime pay: $" + opay);
			System.out.println("Total pay: $" + totalPay);
			if (itemizedDeductions > totalPay) {
				System.out.println("Error: deductions exceed total pay.");
			} else {
				System.out.println("Total itemized deductions: $" + itemizedDeductions);
				System.out.println("Net pay: $" + netPay);
			}
		}
    }
    
}
