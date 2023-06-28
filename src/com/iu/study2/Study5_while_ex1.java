package com.iu.study2;

import java.util.Scanner;
import java.util.Random;

public class Study5_while_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int id=1234;
		int pw=5678;
		boolean check=true;
		int hp=40; //유저의 hp
		int monsterHp= 60; //몬스터의HP
		int monsterPower=40; //몬스터의 공격력
		boolean runfaile=true;
		int skil=3;
		int hunt=0;
		int lv=1;
		
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
			
			int gold=0;
			while(check1) {
				System.out.println("1.계속한다, 2.종료한다");
				int sel1=sc.nextInt();
				
				if(sel1==1) {
					if(hunt>=lv*3) {
						lv++;
						hunt=0;
					}
					System.out.println("현재레벨 : "+lv);
					System.out.println("gold : "+gold);
					
						if(lv==15) {
							System.out.println("최대 레벨입니다.");
						}
						else {
							System.out.println("잡은 몬스터 수 : "+hunt);
							System.out.println("몬스터 출현!");
							 hp=40; //유저의 hp
							 monsterHp= 60;
							 skil=3;
							 
							
							while(runfaile){
								System.out.println("유저의 턴");
								System.out.println("유저의 HP :"+hp);
								System.out.println("몬스터의 HP :"+monsterHp);
								System.out.println("1.평타  2.스킬  3.회복  4.도망");
								int sel2 = sc.nextInt();
								if(sel2==1) {
									int userAt = random.nextInt(10);
									System.out.println(userAt+"의 데미지로 공격!");
									monsterHp=monsterHp-userAt;
									System.out.println("몬스터의 턴");
									int monstAt = random.nextInt(1);	
									hp=hp-monstAt;
									System.out.println(monstAt+"의 데미지를 입었다!");
									if(hp<=0) {
										System.out.println("YOU DIE");
										break;
									}
									else if(monsterHp<=0) {
										System.out.println("몬스터를 잡았다!");
										hunt=hunt+1;
										break;
									}
									}
								else if(sel2==2) {
									if (skil==0) {
										System.out.println("스킬 최대 사용횟수 초과!");
									}
									else {
									int userSk = random.nextInt(30);
									monsterHp=monsterHp-userSk;
									skil--;
									System.out.println("몬스터의 턴");
									int monstAt = random.nextInt(1);	
									hp=hp-monstAt;
									System.out.println(monstAt+"의 데미지를 입었다!");
									if(hp<=0) {
										System.out.println("YOU DIE");
										break;
									}
									else if(monsterHp<=0) {
										System.out.println("몬스터를 잡았다!");
										hunt=hunt+1;
										break;
									}
									}
								}
								else if(sel2==3) {
									int userHe = random.nextInt(41);
									hp=hp+userHe;
									if(hp>40) {
										hp=40;
									}
									System.out.println(userHe+"의 hp를 회복!");
									System.out.println("몬스터의 턴");
									int monstAt = random.nextInt(1);	
									hp=hp-monstAt;
									System.out.println(monstAt+"의 데미지를 입었다!");
									if(hp<=0) {
										System.out.println("YOU DIE");
										break;
									}
									else if(monsterHp<=0) {
										System.out.println("몬스터를 잡았다!");
										hunt=hunt+1;
										break;
									}
								}
								else if(sel2==4) {
									int run = random.nextInt(2);
									if(run==1) {
										System.out.println("도망성공");
										break;
									}
									else {
										System.out.println("도망실패");
										System.out.println("몬스터의 턴");
										int monstAt = random.nextInt(1);	
										hp=hp-monstAt;
										System.out.println(monstAt+"의 데미지를 입었다!");
										if(hp<=0) {
											System.out.println("YOU DIE");
											break;
										}
										else if(monsterHp<=0) {
											System.out.println("몬스터를 잡았다!");
											hunt=hunt+1;
											
											
											break;
										}
									}
								}
								else {
									System.out.println("잘못 눌렀습니다!");
									break;
								}
								
							}
							
							
												
					
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
				else {
					System.out.println("잘못 입력하였습니다.");
					
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