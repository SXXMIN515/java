package com.yedam.java.check;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		boolean run = true;  // 프로그램의 실행여부
		int studentNum = 0;  // 학생수
		int[] scores = null; // 학생들의 점수목록
		Scanner scanner = new Scanner(System.in); // 사용자의 입력
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			// 메뉴선택 => 메뉴선택 할때마다 studentNum, scores 초기화됨
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) { // 학생수 입력 => 배열의 크기
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) { // 점수 입력 => 배열의 모든 값을 입력
				// 배열 <=> for문 사용
				for(int i=0; i<scores.length; i++) { // scores.length 대신 studentNum 사용 가능
					System.out.printf("scores[%d]> ", i);	
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) { // 점수 출력
				for(int i=0; i<scores.length; i++) { // 인덱스
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			} else if(selectNo == 4) { // 최고점과 평균
				int max = scores[0]; // 최고점
				int sum = 0; // 총합
				for(int score : scores) {
					// 1) 최고점
					if(score > max) {
						max = score;
					}
					// 2) 총합
					sum += score;
				}
				double avg = (double) sum / scores.length; 
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
		scanner.close();
	}

}

