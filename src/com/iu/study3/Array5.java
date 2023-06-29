package com.iu.study3;

import java.util.Random;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[6];
		Random random = new Random();
		int count= 0;
		
		//1~45 한 칸마다 하나씩
		
		for(int i=0; i<nums.length;i++) {
			nums[i]=random.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(nums[j]==nums[i]) {
					i--;
					count++;
					System.out.println("중복되었던 숫자 :"+nums[i]);
					break;
				}
				
			}
		}
		
		
		// 0: 12345
		// 1: 2345
		// ..
		// 4: 5
		
		//선택 정렬
		for(int i=0; i<5;i++) {
			for(int j=i+1;j<6;j++) {
				if(nums[i]>nums[j]) {
					int tmp=nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("중복사항"+count+"회 있었음");
	}

}
