package com.yedam.java.practice.score;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		Student[] scoreList = null;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.학생정보입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				
				scoreList = new Student[studentNum];
			} else if (menu == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("이름> ");
					String name = sc.nextLine();
					System.out.print("국어점수> ");
					int korScore = Integer.parseInt(sc.nextLine());
					System.out.print("수학점수> ");
					int mathScore = Integer.parseInt(sc.nextLine());
					System.out.print("영어점수> ");
					int engScore = Integer.parseInt(sc.nextLine());
					
					Student student = new Student(name, korScore, mathScore, engScore);
					scoreList[i] = student;
				}
			} else if (menu == 3) {
				System.out.println("이름 | 국어점수 | 수학점수 | 영어점수");
				for(Student student : scoreList) {
					student.showInfo();
				}
			} else if (menu == 4) {
				int idx = -1;
				
			} else if (menu == 5) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}

}
