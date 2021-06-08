package com.cg.java.demo;
import java.util.Scanner;

public class Lab1Q5 {
	

	 
       public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("please enter number");
	            int n = sc.nextInt();
	            int sum=0,j;
	            int i=Integer.MAX_VALUE;
	            for(int k=1;k<=n;k++) {
	            for(j=1;j<=i;j++)
	            {
	                if (j%3==0 || j%5==0)
	                {    //System.out.println("print j"+j);
	                sum+=j;
	                //System.out.println("print sum"+sum);
	                k++;
	                if(k==n) {
	                    break;
	                }
	                }
	            }
	            }
	            System.out.print("sum of first "+n);
	            System.out.print("natural number is "+sum);
	            

	 

	}
	}


