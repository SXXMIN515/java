package com.yedam.java.ch0302;

public class ArithmeticOperationExample {

	public static void main(String[] args) {
		// 교재 P151, 6번
		int value = 356;
		// 1) 356 - (356%100) = 300
		int result1 = value - (value%100);
	    // 2) (356/100) * 100 = 300
		int result2 = (value/100) * 100;
		System.out.println(result1); // 300
		System.out.println(result2); // 300

	}

}
