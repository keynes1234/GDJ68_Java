package com.iu.Study6;

import java.util.stream.IntStream;

public class ApiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성
		Object obj = new Object();
		boolean check = obj.equals(null);
		String str = obj.toString();
		int code = obj.hashCode();
		String st = "hello";
		st = new String("hello");
		char ch = st.charAt(1);
		IntStream is = st.chars();
		System.out.println(ch);
	}

}
