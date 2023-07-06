package com.iu.Study4;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
	/*	Card card = new Card();
		
		
		Card card2 = new Card();
		
		System.out.println(card.cvc);
		System.out.println(card.name);
		*/
		
		Student1 s1 = new Student1();
		s1.name="채원";
		s1.gender='F';
		
		Student1 s2 = new Student1();
		s2.name="iu";
		s2.gender='F';
		
		StudentView sv = new StudentView();
		//sv.view(s1);
		Student1 [] students = new Student1[2];
		students[0] = s1;
		students[1] = s2;
	//
		//sv.viewAll(students);
		
		//s2=s1;
		
		System.out.println(s2.name);
		
		
		System.out.println("프로그램 종료");
	}

}
