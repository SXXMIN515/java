package com.yedam.java.ch0402;

public class Practice03 {

	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random() * 6 + 1);
			int num2 = (int)(Math.random() * 6 + 1);
			
			if(num1+num2 != 5) {
				System.out.printf("(%d, %d)\n", num1, num2);				
			} else {
				System.out.printf("(%d, %d)\n", num1, num2);
				break;
			}
			
		}

	}

}
