package com.yedam.java.ch1101.string;

public class CommonMethodExample {

	public static void main(String[] args) {
		// charAt
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		// indexOf 1) 실제 위치 확인 2) 포함여부
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("해당 위치: " + location);
		
		if(subject.indexOf("자바") > -1) { // indexOf는 최소값이 -1
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}
		
	}

}
