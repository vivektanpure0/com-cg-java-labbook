package com.cg.java.demo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Q1 {
	
		public static void main(String[] args) {

			int n;
			int sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter an integer - ");
			String s = sc.nextLine();
			sc.close();

			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				String temp = st.nextToken();
				n = Integer.parseInt(temp);
				System.out.println(n);
				sum = sum + n;
				System.out.println("sum of the integers is: " + sum);
			}
			

		}
	}


