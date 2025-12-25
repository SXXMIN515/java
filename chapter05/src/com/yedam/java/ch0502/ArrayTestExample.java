package com.yedam.java.ch0502;

public class ArrayTestExample {

	public static void main(String[] args) {
		// 문제 : 1, 4, 9, 2, 5 중 최대값, 최소값 구하기
		// 배열 선언 및 생성
		int[] numAray = { 1, 4, 9, 2, 5 };
		int max = numAray[0]; // 1
		int min = numAray[0]; // 1
		
		for(int i=0; i<=numAray.length-1; i++) {
			int current = numAray[i];
			if(current > max) {
				max = current;
			}
			if(current < min) {
				min = current;
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
