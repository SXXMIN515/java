package com.yedam.java.ch0302;

public class ConditionalOparationExample {

	public static void main(String[] args) {
		// 삼항연산자 => 조건식 ? 참일 때 값 : 거짓일 때 값
		int score = 87;
		char grade = score > 90 ? 'A' : 'B';
		String message = "최종 결과 : " + (score > 90 ? 'A' : 'B');
		
		if(score>90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		
		System.out.println(message);
		
	}

}
