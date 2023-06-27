package com.iu.study2;

import java.util.Scanner;

public class Study3_ex2_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 Data
		int id = 1234;
		int pw = 5678;
		boolean loginResult;
		int salary;
		int sum1 =0;
		
		//로그인 과정
		//ID와 PW를 입력받아서 로그인 처리
		//로그인성공, 로그인 실패
		
		//--- 로그인 처리 후 작성
		//로그인이 성공한 사람만 실행 가능
		//1. 정규직, 2.계약직
		//급여 입력
		//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		//실급여 출력
		System.out.println("ID 를 입력하세요 :");
		int id1 = sc.nextInt() ;
		System.out.println("PW 를 입력하세요 :");
		int pw1 = sc.nextInt() ;
		
		if(id==id1&&pw==pw1) {
			System.out.println("로그인 성공");	
			loginResult=true;
		}
		else {
			System.out.println("로그인 실패");
			loginResult=false;
		}
		
		if(loginResult) {
		System.out.println("정규직은 1, 계약직은 2를 눌러주세요");
		int job = sc.nextInt() ;	
		
		//salary=sc.nextInt();
		
		switch(job) {		
		case 1:
			System.out.println("급여 입력");
			salary=sc.nextInt();
			double tax1 = salary*0.03;
			tax1 = tax1 + salary*0.02;
			tax1 = tax1 +salary*0.01;
			tax1 = tax1 +salary*0.01;
			sum1 = (int)(salary-tax1);
	
			break;
		case 2:
			System.out.println("급여 입력");
			salary=sc.nextInt();
			double tax2 = salary*0.033;
			sum1 = (int)(salary-tax2);
		
			break;
		default:
			System.out.println("잘못 눌렀습니다");
			loginResult=false;
		}
		if(loginResult) {
			System.out.println("실 급여 : "+sum1);
		}
			
		}
		
		else {
			System.out.println("잘못 입력하였습니다.");
		}
		
	}
}

	
	
	
	