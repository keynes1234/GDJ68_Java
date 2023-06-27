package com.iu.lshex1;

public class Study1_ex1 {
	public static void main(String [] args) {
		System.out.println("프로그램 시작");
		
		//자기정보를 변수에 담아서 출력
		//이름, 나이, 키, 전화번호, 혈액형, 졸업학점
		
		String name="승환";
		int age = 29;
		double height = 178;
		String phone = "01025315487";
		char blood = 'A';
		int grade = 3;
		
		System.out.println("당신의 이름은 " + name + " 입니다.");
		System.out.println(age);
		System.out.println(height);
		System.out.println(phone);
		System.out.println(blood);
		System.out.println(grade);

		
		int count =78;
		count = count+1;
		count++;
		++count; //81
		
		int r = ++count;
		
		count = count+1;
		count+=1;
		count = count*1;
		count*=1;
		
		System.out.println("Count : " +count);
		System.out.println("R : " +r);
		
		System.out.println("프로그램 종료");
	}
}
