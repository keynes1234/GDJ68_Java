package com.iu.Study4.s2;

public class S2Main {

	public static void main(String[] args) {
		/*
		//1. 프로그램 실행
		//2. 테스트 용도
		
		//객체생성
		Chef chef = new Chef();
		//Ramyun [] ramyuns = chef.makeRamyun(3);
		
		Ramyun [] ramyuns = new Ramyun[2];
		chef.makeRamyun2(ramyuns);
		System.out.println(ramyuns[0].title);
		
		int count=2;
		chef.makeRamyun(count);
		System.out.println(count);
		
		//ramyuns
		//Chef chef2 = new Chef();
		chef.makeKimbap();
		
		
		
//		StudentService sv= new StudentService();
//		Student student = sv.makeStudentOne();
//		System.out.println(student.avg);
		//참조변수명.변수
		*/

		
		StudentControler studentControler = new StudentControler();
		studentControler.start();
	}

}
