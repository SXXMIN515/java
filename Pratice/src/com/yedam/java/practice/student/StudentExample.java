package com.yedam.java.practice.student;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		Student[] scoreList = null;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				
				scoreList = new Student[studentNum];
			} else if (menu == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("%d번째 학생 정보 입력\n", i+1);
					System.out.print("이름> ");
					String name = sc.nextLine();
					System.out.print("점수> ");
					int score = Integer.parseInt(sc.nextLine());
					
					Student student = new Student(name, score);
					scoreList[i] = student;
				}
			} else if (menu == 3) {
				System.out.println("이름 | 점수");
				for(int i=0; i<studentNum; i++) {
					Student student = scoreList[i];
					student.showInfo();
				}
			} else if (menu == 4) {
				CalculateScore max = new CalculateScore(0, scoreList[0].getScore());
				CalculateScore min = new CalculateScore(0, scoreList[0].getScore());
				int sum = 0;
				
				for(int i=0; i<studentNum; i++) {
					Student student = scoreList[i];
					
					if(max.getScore() < student.getScore()) {
						max.setScore(student.getScore());
						max.setIdx(i);
					}
					if(min.getScore() > student.getScore()) {
						min.setScore(student.getScore());
						min.setIdx(i);
					}
					
					sum += student.getScore();
				}
				double avg = (double) sum / studentNum;
				
				System.out.printf("최고점 학생: %s\n", scoreList[max.getIdx()].getName());
				System.out.printf("최고점: %d\n", scoreList[max.getIdx()].getScore());
				System.out.printf("최하점 학생: %s\n", scoreList[min.getIdx()].getName());
				System.out.printf("최하점: %d\n", scoreList[min.getIdx()].getScore());
				System.out.printf("평균 점수: %.2f\n", avg);
			} else if (menu == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
