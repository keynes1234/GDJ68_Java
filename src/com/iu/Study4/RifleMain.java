package com.iu.Study4;

import java.util.Scanner;

public class RifleMain {

	public static void main(String[] args) {
		//클래스명 변수명 = new 클래스명();
		Rifle rifle = new Rifle();
		
		//멤버들 사용법
		//1. 멤버변수 변수명.맴버변수명
		//2. 맴버메서드 변수명.맴버메서드명()
		
		//rifle.shoot();
		//rifle.shoot2();
		
		Scanner sc = new Scanner(System.in);
				System.out.println("1. 단발 2. 점사");
				int select = sc.nextInt();
				
				if(select==1) {
					
					rifle.shoot();
				}
				else {
					rifle.shoot2();
				}
		}

}
