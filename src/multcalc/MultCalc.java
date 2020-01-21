package multcalc;

import java.util.Scanner;

public class MultCalc {

	public static void main(String[] args) {
		int choice;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("==================================");
			System.out.println("  Kyle's Multipurpose Calculator");		
			System.out.println("==================================");
			System.out.println("Type the chosen number: ");
			System.out.println("1. Wage Calculator");
			System.out.println("2. Pythagorean Theorem ");
			System.out.println("3. Math Calculator");
			System.out.println("4. Statistical Calculator");
			System.out.println("5. Exit");
			System.out.println("==================================");

			choice=input.nextInt();
			switch(choice) {
			case 1: WageCalc.wc();
			break;
			case 2: PythaTheorm.pt();
			break;
			case 3: MathCalc.mc();
			break;
			case 4: StatCalc.sc(choice);
			break;
			case 5: 
				System.out.println("Thank you for using the Kyle's Multipurpose Calculator");
				break;
			}
		}while(choice!=5);

	}
}
