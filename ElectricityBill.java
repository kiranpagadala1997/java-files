package com.Edu;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name: ");
	String name=sc.nextLine();
	System.out.println("Enter the no of units consumed: ");
	int units=sc.nextInt();
	if(units<200&&units>0 )
		System.out.println("The bill charged for the units "+units+ " is " +units*3.80);
	
		else if(units>=200&&units<300)
			System.out.println("The bill charged for the  units"+units+ " is " +units*4.40);
	
		else if(units>=300&&units<400)
			System.out.println("The bill charged for the units"+units+ " is " +units*5.10);
	
		else
			System.out.println("The bill charged for the units "+units+ " is  "+units*5.80);
	
	}

}
