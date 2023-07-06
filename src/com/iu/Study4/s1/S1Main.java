package com.iu.Study4.s1;

public class S1Main {

	public static void main(String[] args) {

		Hap hap = new Hap();
		
		int sum = hap.h1(10, 20);
		
		//h2
		boolean check =hap.h2(21);
		System.out.println(check);
		//h3 length 출력
		int [] ar = hap.h3(4);
		System.out.println(ar.length);
		
		System.out.println(sum*2);
	}

}
