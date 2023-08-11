package com.Edu;

import java.util.Scanner;

public class ElseifCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int marks= sc.nextInt();
	if(marks<=100 && marks>=0)
	{
		if(marks<=100 && marks>=80)
			System.out.println("Grade A");
		else if(marks<=89 && marks>=70)
			System.out.println("Grade B");
		else if(marks<=60 && marks>=50)
			System.out.println("Grade C");
		else
			System.out.println("Grade D");
			}
	else
		System.out.println("invalid marks");
	}

}
