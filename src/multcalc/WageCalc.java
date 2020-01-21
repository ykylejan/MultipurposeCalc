package multcalc;

import java.util.Scanner;

public class WageCalc {
	public static void wc() {
		int hours =0;
		int salary =0;
		int regpay =110;
		int overpay =150;
		int overtime =0;
		int choice = 0;
		String name = "";
		
		Scanner input = new Scanner (System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner (System.in);		

		do {
			System.out.println("==================================");
			System.out.println("         WAGE CALCULATOR");
			System.out.println("==================================");
			System.out.print("Type your name: ");
			name=input.nextLine();
			System.out.print("Type your rendered hours: ");
			hours=input2.nextInt();
			
			
		if (hours <= 8) {
			salary = hours*regpay;
			overtime = 0;
		}
		
		else if (hours > 8) {
			salary = 880+((hours-8)*overpay);
			overtime = hours - 8;
		}
		
		System.out.println("==================================");
		System.out.println("         WAGE CALCULATOR");
		System.out.println("==================================");
		System.out.println("NAME: "+name);
		
		if (hours > 8) {
	    System.out.println("HOURS: "+hours+ " ("+overtime+" Overtime)");
		} 
		else {
			System.out.println("HOURS: "+hours);
		}
		
		System.out.println("WAGE: "+salary+" \n");
		System.out.println("Type 0 to go back ");
		System.out.println("Type any other number to calculate again");
		choice=input3.nextInt();

		}while(choice!=0);
	}

}
