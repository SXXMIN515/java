package com.yedam.java.ch0501;

public class StringExample {

	public static void main(String[] args) {
		String str1 = "신용권";
		String str2 = "신용권";
		
		str2 = "이것이 자바다";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		int[] first = {1,2,3};
		int[] second = first;
		second[1] = 10;
		System.out.println(first[1]);
		
		int[] third = null;
		//System.out.println(third.length);
		
		String strA = new String("신용권");
		String strB = new String("신용권");
		System.out.println("strA : " + strA);
		System.out.println("strB : " + strB);
		if(strA == strB) {
			System.out.println("해당 객체들은 같은 객체입니다.");
		} else {
			System.out.println("해당 객체들은 서로 다른 객체입니다.");
		}
		
		if(strA.equals(strB)) {
			System.out.println("두 변수는 같은 값을 가지고 있습니다.");
		} else {
			System.out.println("두 변수는 다른 값을 가지고 있습니다.");
		}
	}

}
