package com.cg.java.demo;

	class MyException2 extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		MyException2(String s) {
			super(s);
		}
	}

	public class Lab5Q2 {
		public static void validate(String s1, String s2) throws MyException2 {
			if (s1.isBlank() || s2.isBlank()) {
				throw new MyException2(" You must enter First name and Last Name.!");
			} else {
				System.out.println(" You are Welcome...!!");
			}
		}

		public static void main(String[] args) {
			String firstName = "Vivek";
			String lastName = "Tanpure";
			try {
				validate(firstName, lastName);
			} catch (MyException2 me) {
				System.out.println("Exception Occured " + me.getMessage());
			}
			for (int i = 0; i < 10; i++) {
				System.out.println();
			}
		}

	}




