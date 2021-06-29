package com.cg.java.demo;

import java.util.Scanner;

//Exercise 1:  Validate the age of a person and display proper message by using user defined exception. 
	//Age of a person should be above 15.

public class Lab4Q1 {
	


	public static void main(String[] args) {
			
//			int age = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the age -");
			int age = sc.nextInt();
			if(age >= 15) {
				System.out.println("Age is above 15");
			}else {
				System.out.println("Age is below 15");
			}
			System.out.println(age);
			
			sc.close();
		}
			
		}

