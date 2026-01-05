package com.yedam.java.ch1101.object;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		if(obj1 == obj2) { // 연산자를 이용해서 비교하면 메모리 주소를 비교하기 때문에 동일한 인스턴스가 아니라고 나옴.
			System.out.println("동일한 인스턴스입니다.");
		} else {
			System.out.println("서로 다른 인스턴스입니다.");
		}
		
		if(obj1.equals(obj2)) { // equals는 내부의 값을 비교하기 때문에 동일한 인스턴스라고 나옴.
			System.out.println("동일한 인스턴스입니다.");
		} else {
			System.out.println("서로 다른 인스턴스입니다.");
		}
	}

}
