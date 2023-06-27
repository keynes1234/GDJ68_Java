package com.iu.lshex1;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
		//if(조건식)(조건식이 true일때만 실행)

		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 수학, 영어를 입력");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int sum= kor+eng+math;
		double avg= sum/3;
		String grade= "F";
		
		if(avg>=90) {
			 grade="A";
		}
		 if(avg>=80&&avg<90) {
			 grade="B";
		}
		 if(avg>=70&&avg<80) {
			 grade="C";
		}
		 if(avg>=60&&avg<70) {
			 grade="D";
		}
		
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(grade);
	}
}
