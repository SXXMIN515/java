package com.yedam.java.ch1101.math;

public class RandomExample {

	public static void main(String[] args) {
		// 5 ~ 20까지 범위
		int num = (int)(Math.random() * 15) + 5;
		System.out.println(num);
	}

}
