package com.iu.study3;

public class Array3 {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		System.out.println("nums의 길이 :"+nums.length);
		
		//배열개수늘리기
		int [] copyNums = new int [nums.length+1];
		
		for(int i=0;i<nums.length;i++) {
			copyNums[i]= nums[i];
			
		}
		copyNums[nums.length]=5;
		nums=copyNums;
		//끝
		
		//배열개수줄이기
		copyNums = new int [nums.length-1];
		
		for(int i=0;i<copyNums.length;i++) {
			copyNums[i] = nums[i];
			
		}
		nums=copyNums;
		
		for(int i=0;i<copyNums.length;i++) {
			System.out.println(nums[i]);
		}
		//끝
		System.out.println("nums의 길이 :"+nums.length);
		
	}

}
