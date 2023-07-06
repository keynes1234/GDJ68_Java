package com.iu.Study4.s2;

import java.util.Scanner;

public class StudentControler {
	public void start() {
		//1. 학생정보 생성 -- makeStudents 호출
		//2. 학생정보 출력 -- SV에서 출력
		//3. 프로그램 종료 
		int select=0;
		StudentService studentService = new StudentService();
		StudentView studentView = new StudentView();
		Student [] students = null ;
		Scanner sc = new Scanner(System.in);
		
	 while(true){
		
		System.out.println("1.학생정보생성");
		System.out.println("2.학생정보출력");
		System.out.println("3. 학생정보검색");
		System.out.println("4.프로그램종료");
		select = sc.nextInt();
		
		if(select ==1) {
			students= studentService.makeStudents();
			System.out.println("1");
		}else if(select==2){
			studentView.view(students);
			System.out.println("2");
		}else if(select==3){
			//1.findBynum
			//2.viewOne
			Student student = studentService.findByNum(students);
			studentView.view(student);
		}else {
			System.out.println("종료합니다.");
			break;
		}
	 }
	}
}
