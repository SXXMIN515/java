package com.yedam.java.ch0203;

public class StringPromotionExample {

	public static void main(String[] args) {
		// + 연산 : 문자열이 섞일 경우 기본타입을 문자열로 자동타입변환
		String str1 = String.valueOf(1 + 2 + 3); // String.valueOf()
		str1 = 1 + 2 + 3 + "";     // "6" 이 방식을 더 많이 사용함. 
		String str2 = 1 + 2 + "3"; // "33"
		String str3 = 1 + "2" + 3; // "123"
		String str4 = "1" + 2 + 3; // "123"
		String str5 = "1" + (2 + 3); // "15"
		System.out.println(str1); 
		System.out.println(str2); 
		System.out.println(str3); 
		System.out.println(str4); 
		System.out.println(str5); 
		
		// 강제타입변환 : 각 타입별 메서드 사용
		int val1 = Integer.parseInt("1234");
		double val2 = Double.parseDouble("2.5");
		double result = val1 + val2; // 1234.0 + 2.5 => 1236.5
		System.out.println(result);
	}

}
