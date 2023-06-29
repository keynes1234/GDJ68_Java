package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int num2=2;
		double d=3.12;
		
		//데이터타입 변수명
		//모으려고 하는 데이터타입[] 변수명 = new 모으려고 하는 데이터타입[갯수];
		int [] nums = new int[2];
		double [] avgs = new double[3];
		char [] chs = new char[3];
		boolean [] cheks = new boolean[3];
		
		//문자열 3개를 모을 배열 선언
		String [] names = new String[3];
		
		System.out.println(num);
		System.out.println(nums);
		System.out.println(names);
		//배열 사용 : 배열의 변수명[인덱스번호], index번호는 정수타입(int)
		
		System.out.println(nums[0]);
		System.out.println(chs[0]);
		System.out.println(cheks[0]);
		System.out.println(names[0]);
		
		nums[0]=2;
		
		int [] nums2 = {1,2,3};
		
		int nums3 [] = new int [3];
		
		
	}

}
