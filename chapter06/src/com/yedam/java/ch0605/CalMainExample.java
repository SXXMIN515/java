package com.yedam.java.ch0605;

public class CalMainExample {

	public static void main(String[] args) {
		// 정적 멤버 : 인스턴스와 무관 => new 연산자를 진행하지 않고도 접근
		System.out.println("PI : " + Calculator.pi);
		int result = Calculator.plus(10, 5);
		System.out.println("+ : " + result);
		result = Calculator.minus(10, 5);
		System.out.println("- : " + result);
		
		Calculator cal = new Calculator();
		System.out.println(cal.type);
		Calculator.pi = 3.14;
		System.out.println("PI : " + Calculator.pi);
	}

}
