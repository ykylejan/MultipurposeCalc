package multcalc;

import java.util.Scanner;

public class MathCalc {
	public static void mc() {
		double var1=0;
		double var2=0;
		int choice=0;

		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);
		Scanner input6 = new Scanner(System.in);
		Scanner input7 = new Scanner(System.in);

		do {
			System.out.println("==================================");
			System.out.println("         Math Calculator");
			System.out.println("==================================");
			System.out.println("Type the corrresponding number for choice or type 5 to go back");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Divsion");
			System.out.println("5. Back");
			
			choice=input.nextInt();
		
			
			if(choice ==1) {
				System.out.print("Type the first variable: ");
				var1=input1.nextDouble();
				System.out.print("Type the second variable: ");
				var2=input2.nextDouble();
				System.out.println("The answer is: "+(var1+var2)+" \n");
				
				System.out.println("Type 0 to go back");
				System.out.println("Type any other number to calculate again");
				choice=input4.nextInt();
			}

			else if(choice ==2) {
				System.out.print("Type the first variable: ");
				var1=input1.nextDouble();
				System.out.print("Type the second variable: ");
				var2=input2.nextDouble();
				System.out.println("The answer is: "+(var1-var2)+" \n");
				
				System.out.println("Type 0 to go back");
				System.out.println("Type any other number to calculate again");
				choice=input5.nextInt();
			}
			else if(choice ==3) {
				System.out.print("Type the first variable: ");
				var1=input1.nextDouble();
				System.out.print("Type the second variable: ");
				var2=input2.nextDouble();
				System.out.println("The answer is: "+(var1*var2)+" \n");
				
				System.out.println("Type 0 to go back");
				System.out.println("Type any other number to calculate again");
				choice=input6.nextInt();
			}
			else if(choice ==4) {
				System.out.print("Type the first variable: ");
				var1=input1.nextDouble();
				System.out.print("Type the second variable: ");
				var2=input2.nextDouble();
				System.out.println("The answer is: "+(var1/var2)+" \n");
				
				System.out.println("Type 0 to go back");
				System.out.println("Type any other number to calculate again");
				choice=input7.nextInt();
				
			}

		}while(choice!=5);
	}
}
