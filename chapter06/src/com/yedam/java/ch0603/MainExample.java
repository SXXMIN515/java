package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		Car hongCar = new Car("캐스퍼", "초록");
		System.out.println("hongCar =================");
		System.out.println("제조사 : " + hongCar.company);
		System.out.println("모델 : " + hongCar.model);
		System.out.println("색깔 : " + hongCar.color);
		
		Car kangCar = new Car("쏘나타", "흰색");
		System.out.println("kangCar =================");
		System.out.println("제조사 : " + kangCar.company);
		System.out.println("모델 : " + kangCar.model);
		System.out.println("색깔 : " + kangCar.color);
		
		Car leeCar = new Car("기아자동차", "레이", "파랑");
		System.out.println("leeCar =================");
		System.out.println("제조사 : " + leeCar.company);
		System.out.println("모델 : " + leeCar.model);
		System.out.println("색깔 : " + leeCar.color);
		
		Member user1 = new Member("홍길동", "hong");
		System.out.println("user1 =================");
		System.out.println("이름 : " + user1.name);
		System.out.println("id : " + user1.id);
	}

}
