package com.iu.lshex1;

import java.util.Scanner;

public class Study2_ex2 {
	public static void main(String [] args) {
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		
		//입력 	출력
		//1		1
		//5		11
		//6		12	
		//7		13
		//8		20
		//9		21
		//10	22
		//11	23
		//12	30
		//13	31
		//14	32
		//15	33
		//16	40
		//17	41 
		//18	42
		//19	43
		//20	50		
		System.out.println("숫자를 입력하세요 :");
		int input=sc.nextInt();
		
		int //output=input/4*10+input%4;
		 output=input/4*6+input;
		
		System.out.println("Input : "+input+", Output : "+output);
		System.out.println("finish");
	}
}
