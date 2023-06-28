package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int hp=40; //유저의 hp
		int monsterHp= 60; //몬스터의HP
		int monsterPower=40; //몬스터의 공격력
		boolean runfaile=true;
		int skil=3;
		int hunt=0;
		//1.평타 2.스킬 3.hp회복 4.도망
		//평타 : 0~10 미만의 공격이 몬스터에게 적용
		//스킬 : 0~30 미만의 공격이 몬스터에게 적용 (최대 3번까지만)
		//회복 : 회복량 0~40 까지 40X
		//도망 : 50% 확률로 성공, 실패
		
		//monster
		//1 : 유저 공격 0~40의 공격을 유저에게 
		
		System.out.println("몬스터 출현!");
		
		
		while(runfaile){
			
			System.out.println("잡은 몬스터 수 : "+hunt);
			System.out.println("유저의 턴");
			System.out.println("유저의 HP :"+hp);
			System.out.println("몬스터의 HP :"+monsterHp);
			System.out.println("1.평타  2.스킬  3.회복  4.도망");
			int sel = sc.nextInt();
			if(sel==1) {
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
					break;
				}
				}
			else if(sel==2) {
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
					break;
				}
				}
			}
			else if(sel==3) {
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
					break;
				}
			}
			else if(sel==4) {
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
						hunt++;
						break;
					}
				}
			}
			
			
		}
		
	}
}
