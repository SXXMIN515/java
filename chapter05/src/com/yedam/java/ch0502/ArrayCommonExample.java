package com.yedam.java.ch0502;

public class ArrayCommonExample {

	public static void main(String[] args) {
		// 배열 선언
		int[] intAray = null;
		// 배열 선언 후 생성
		intAray = new int[] { 1, 3, 4}; // 1) 값을 가지고 있는 배열
		System.out.println("길이 : " + intAray.length); // ReadOnly
		for(int i=0; i<intAray.length; i++) {
			System.out.println(i + ") " + intAray[i]);
		}
		intAray = new int[5]; // 2) 크기만 지정된 배열
		for(int i=0; i<intAray.length; i++) {
			System.out.println(i + ") " + intAray[i]);
		}
		for(int i=0; i<intAray.length; i++) {
			intAray[i] = i * 10;
		}
		for(int i=0; i<intAray.length; i++) {
			System.out.println(i + ") " + intAray[i]);
		}
	}

}
