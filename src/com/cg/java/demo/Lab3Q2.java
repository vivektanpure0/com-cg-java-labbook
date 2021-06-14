package com.cg.java.demo;
import java.util.Scanner;

public class Lab3Q2 {

	
	    public  void getImage (String str) {
	        StringBuffer sb = new StringBuffer(str);
	        sb.reverse();
	        System.out.println(str+"|"+sb);
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String ");
	        String str = sc.next();
	        Lab3Q2 lb = new Lab3Q2();
	        lb.getImage(str);
	    }
	}


