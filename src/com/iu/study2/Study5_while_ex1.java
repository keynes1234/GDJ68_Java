package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check=true;
		
		
		while(check) {
		System.out.println("1.로그인시도, 2.프로그램 종료");
		int sel=sc.nextInt() ;
					
		if(sel==1) {
		System.out.println("ID 를 입력하세요 :");
		int id1 = sc.nextInt() ;
		System.out.println("PW 를 입력하세요 :");
		int pw1 = sc.nextInt() ;
		
		if(id==id1&&pw==pw1) {
			System.out.println("로그인 성공");
			System.out.println("MMORPG 시작");
			System.out.println("1레벨");
			boolean check1=true;
			int hunt=0;
			int lv=1;
			int gold=0;
			while(check1) {
				System.out.println("1.계속한다, 2.종료한다");
				int sel1=sc.nextInt();
				
				if(sel1==1) {
						
					System.out.println("현재레벨 : "+lv);
					System.out.println("gold : "+gold);
						if(lv==15) {
							System.out.println("최대 레벨입니다.");
						}
						else {
							for(hunt=0;hunt<lv*3;hunt++) {
							System.out.println("사냥성공");
						}					
					lv++;
					if(lv%5==0) {
						gold=gold+(lv/5*1000);
					}
				}
						
					System.out.println("현재레벨 : "+lv);
					System.out.println("gold : "+gold);
				}
				
				else if(sel1==2) {
					System.out.println("게임종료");
					break;
				}
			}
			break;
		}
		else if(id!=id1&&pw!=pw1) {
			System.out.println("ID 를 입력하세요 :");
			id1 = sc.nextInt() ;
			System.out.println("PW 를 입력하세요 :");
			pw1 = sc.nextInt() ;
		}
		
		}
		else if(sel==2) {
			System.out.println("프로그램 종료");
			break;
		}
		else {
			System.out.println("잘못눌렀습니다.");
		}
	}
}
	//로그인 성공했을때만 진행
	//MMORPG
	//시작레벨:1
	//모든 몬스터의 경험치는 동일
	//최대레벨:15
	//GOLD : 0
	//5레벨 달성시 : 1000GOLD 지급
	//10레벨 달성시 : 2000GOLD 지급
	//15레벨 달성시 : 3000GOLD 지급
	//1 -> 2 : 3 (사냥성공)
	//2 -> 3 : 6
	//3 -> 4 : 9
	//4 -> 5 : 12
	//.......
	//14 -> 15 :42
	//렙업시 게임을 계속할지 종료할지 선택
	//현재레벨, GOLD가 출력
}