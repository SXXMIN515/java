package com.yedam.java.check.ch0604_03;

public class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
		boolean isSuccessed = false;
		if(id.equals("hong") && password.equals("12345")) {
			this.id = id;
			this.password = password;
			isSuccessed = true;
		} 
		return isSuccessed;
	}
	
	void logout(String id) {
		if(this.id.equals(id)) {
			System.out.println("로그아웃 되었습니다.");			
		} else {
			System.out.println("다시 시도하세요.");			
		}
	}
}
