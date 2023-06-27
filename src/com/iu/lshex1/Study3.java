package com.iu.lshex1;

import java.util.Scanner;

public class Study3 {
	public static void main(String [] args) {
		
		//국어점수를 담을 변수
		//영어점수를 담을 변수
		//수학점수를 담을 변수
		
		int kor  = 0;
		int eng  = 0;
		int math = 0;
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("숫자를 입력하세요 :");
		//int kor =sc.nextInt();
		
		//총점을 담을 변수
		
		double avr=0;
		
		kor =  37;
		eng =  30;
		math = 30;
		int total  = kor + eng + math;
		avr = total/3;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avr);
		
		//자동형변환
		avr = (double)kor;
		avr = kor;
		
		
		//강제형변환
		eng = (int)avr;
		
		
		long n1=0l;//8
		float f1 =0.0f;//4
		
		
		
		
	}
}
