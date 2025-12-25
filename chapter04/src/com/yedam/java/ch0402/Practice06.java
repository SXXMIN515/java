package com.yedam.java.ch0402;

public class Practice06 {
	public static void main(String[] args) {
//		int star = 0;
//		for(int i=4; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			star++;
//			for(int k=0; k<star; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// 1) 네줄을 출력하는 부분을 담당하는 for문 처리
		for (int len = 1; len <= 4; len++) { // len = '*'의 갯수
			// 2) 한줄을 구성하는 부분
			// => 네칸을 출력하는 부분을 담당하는 for문처리
			for (int ch = 4; ch > 0; ch--) {
				if (ch > len) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 1) 네줄을 출력하는 부분을 담당하는 for문 처리
		for (int len = 1; len <= 4; len++) { // len = '*'의 갯수
			// 2) 한줄을 구성하는 부분
			// 2-1) 공백을 출력하는 칸
			for (int ch = 1; ch <= (4 - len); ch++) {
				System.out.print(" ");
			}

			// 2-2) '*'을 출력하는 칸
			for (int i = 1; i <= len; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
