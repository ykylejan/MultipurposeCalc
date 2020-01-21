package multcalc;

import java.util.Scanner;

public class PythaTheorm {
	public static void pt() {
		int choice;
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		do {
			
			System.out.println("==================================");
			System.out.println("       Pythagorean Theorem");
			System.out.println("==================================");
			System.out.print("Type the first variable: ");
			a = input2.nextDouble();
			System.out.print("Type the second variable: ");
			b = input3.nextDouble();
			
			c =  Math.sqrt((a*a)+(b*b));
			System.out.println("The answer is: "+c+" \n");
			
			System.out.println("Type 0 to go back");
			System.out.println("Type any other number to calculate again");
			choice=input.nextInt();
			
			
		} while(choice != 0);
		
	}
}
