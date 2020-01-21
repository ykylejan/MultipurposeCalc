package multcalc;

import java.util.Scanner;

public class StatCalc {
	static void sc(int x) {
		int choice;
		int var = 0;
		double sum =0;
		double average=0;
		double total=0;
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		do {
			System.out.println("==================================");
			System.out.println("      STATISTICAL CALCULATOR");
			System.out.println("==================================");
			System.out.println("How many variables: ");
			var=input.nextInt();
			int a[] = new int[var];
			
			System.out.println("Enter the data: ");
			
			for(int i=0; i<var; i++) {
				a[i]=input2.nextInt();
				sum = sum + a[i];
			}
			
			average = sum / var;
			
			for(int i=0; i<var; i++) {
				double powresult = Math.pow((a[i] - average), 2);
				total = total + powresult;
			}
			
			double n =(1.0/var)*total;
			double sd = Math.sqrt(n);
			
			System.out.println("==================================");
			System.out.println("      STATISTICAL CALCULATOR");
			System.out.println("================================== \n");
			
			System.out.println("Sum: "+sum);
			System.out.println("Total data: "+var);
			System.out.println("Mean: "+average);
			System.out.println("Standard Deviration: "+sd+" \n");
			
			System.out.println("Type 0 to go back ");
			System.out.println("Type any other number to calculate again");
			choice=input2.nextInt();
			
		} while(choice!=0);
		
	}

}
