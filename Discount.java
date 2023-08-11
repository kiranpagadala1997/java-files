package com.Edu;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String product=sc.nextLine();
		float price=sc.nextFloat();
		float discount;
		
	
	if(price<=10000&&price>0)
	{
		discount = (float) (price*0.05);
	}
	else if(price>10000&&price<=20000)
	{
		discount = (float) (price*0.1);
		}
	else if(price>20000&&price<=35000)
	{
		discount = (float) (price*0.15);
		}
	else
	{
		discount = (float) (price*0.2);
	}
	System.out.println("Product name : "+product);
	System.out.println("Final price : "+(price-discount));
} 
	}
