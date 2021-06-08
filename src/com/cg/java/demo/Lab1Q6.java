package com.cg.java.demo;

import java.util.Scanner;

public class Lab1Q6 {
	
	private static int n;
	public static int difference(int n){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = sc.nextInt();
		
		
	
	      //sum of squares of n natural numbers
	      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
	      //sum of n natural numbers
	      int sumN = (n * (n + 1)) / 2;
	      //square of sum of n natural numbers
	      int squareSumN = sumN * sumN;
	      //difference
	      return Math.abs(sumSquareN - squareSumN);
	   }
	   public static void main(String args[]){
	
		
	      System.out.println("Number: " + n);
	      System.out.println("Difference: " + difference(n));
	   }
}
