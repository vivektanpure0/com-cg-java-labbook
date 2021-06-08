package com.cg.java.demo;
import java.util.Scanner;

public class Lab1Q1 {
	public static void main(String[] args) {
		// Accept User Input in variable num
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an Integer- ");
		int num = sc.nextInt();
		
		// Declare variables rem and sum
		int rem, sum=0;
		
		//Loop over a number
		while(num>0) {
			rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
		}
		
		// Print Sum of cubes of digit in a number
		System.out.println(sum);
		
		
		}


}
