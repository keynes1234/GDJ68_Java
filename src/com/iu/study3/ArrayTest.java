package com.iu.study3;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		Random random = new Random();
		int [][]array = new int[a][b];
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				array[i][j]=random.nextInt(45)+1;
				System.out.println(i+" "+j+" 배열값 "+array[i][j]+"");
			}
		}

	}

}
