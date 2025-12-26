package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company; // 제조사
	String model; // 모델
	String color; // 색깔
	int maxSpeed; // 최대속도
	int currentSpeed; // 현재속도 => 상태
	
	// 생성자 : 리턴타입이 없고 고유이름 대신 클래스명을 대신 사용
	//      => 인스턴스 생성 시 초기값 설정이 목적
	public Car(String model, String color) {
		// 클래스 내부에서 필드에 접근을 하는 경우 this를 활용하도록 권장
		this("현대자동차", model, color); // 재호출
	}
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this("현대자동차", model, color);
		this.maxSpeed = maxSpeed;
	}
	// => 생성자 오버로딩 : 매개변수의 데이터타입 구성을 다르게 해서
	//                  다양한 형태의 인스턴스를 만들 수 있는 여러 생성자 지원
	
	// 기본생성자는 클래스 내부에 생성자가 하나도 없을 경우에만 자동추가
}
