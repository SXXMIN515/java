package com.yedam.java.ch0701;

// 자식 클래스
public class Computer extends Calculator {
	// @ : 어노테이션, 덧붙이는 기능
	@Override // 컴파일할 때 메소드 오버라이딩을 체크해주세요
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
