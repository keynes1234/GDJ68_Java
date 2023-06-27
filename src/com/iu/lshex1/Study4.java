package com.iu.lshex1;

import java.util.Scanner;

public class Study4 {

	public static void main(String[] args) {
		
		int age=20;
		//String result = age>19?"성년":"미성년";

		//System.out.println(result);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("물건의 합계를 입력");
	int price = sc.nextInt();
	
	
	price = price<30000?(int)(price*0.95):(int)(price*0.9);
	//가격이 30000원 미만이면 5% 할인, 아니면 10% 할인, 단 배송비 제외
	System.out.println("최종 가격: "+price);
	
	
	}

}
