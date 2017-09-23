package HighestNumberPKG;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		
		// Using Scanner to take dynamic/runtime values for parameters num1 and num2
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter the value for Num1");
	    int num1 = input.nextInt();
				
		System.out.println("Enter the value for Num2");
		int num2 = input.nextInt();
		
		System.out.println("Enter the value for Num3");
		int num3 = input.nextInt();
		
		if ((num1 > num2) && (num1 > num3))
		{
			System.out.println("The Highest of Num1. Num2 and Num3 is : "+ num1);
		}
		else if ((num2 > num1) && (num2 > num3))
		{
			System.out.println("The Highest of Num1. Num2 and Num3 is : "+ num2);
		}
		
		// This condition will handle both when Num3 is the highest and when Num1, Num2 and Num3 are equal
		else
		{
			System.out.println("The Highest of Num1. Num2 and Num3 is : "+ num3);
		}
			
		input.close();
	}
}