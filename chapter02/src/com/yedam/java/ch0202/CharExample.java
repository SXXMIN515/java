package com.yedam.java.ch0202;

public class CharExample {

	public static void main(String[] args) {
		// char : 유니코드
		int val = 65;
		char c1 = 65; // 유니코드 65 => A
		System.out.println(val);
		System.out.println(c1);

		char c2 = (char)(c1 + 1); // 유니코드 66 => B
		System.out.println(c2); // B
		
		int v2  = 'C'; // char 타입의 리터럴은 홑따움표로 표시
		char c3 = 'C';
		System.out.println(v2); // 67
		System.out.println(c3); // C
		
		String str = "CA"; // 문자열(문장)을 다루는 참조타입
		char[] cAry = str.toCharArray();
		System.out.println(cAry[0] + ", " + cAry[1]);
	}

}
