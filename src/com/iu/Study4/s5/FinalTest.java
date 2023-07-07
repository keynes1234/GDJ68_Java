package com.iu.Study4.s5;

public final class FinalTest {  //상속불가
	
	public static final int SIZE=50;
	
	
	public final int num;	//상수-한번 입력한 값은 변경이 불가
	
	//public final int MAX_NUM; //상수-한번입력한 값은 변경이 불가
	
//	{
//		this.num=20;
//	}
	
	public FinalTest() {
		this.num=20;
	}
	
	public final void finalMethod() {  //오버라이딩 불가
		final int a=10; // 상수-한번 입력한 값은 변경이 불가
		
	}
	
}
