package com.iu.lshex1;

public class Study2_ex1 {
	public static void main(String [] args) {
		System.out.println("start");
		/*
		int n=1623;
		int result = n%1000;
		System.out.println("Result : "+result);
		*/
		
		//물건의 합계값
		int value= 1110;
		
		//손님이 낸돈
		int don=9000;
		
		//잔돈 계산
		int jandon= don-value; //14760
		
		//
		
		int man=0;
		int chon=0;
		int back=0;
		int sib=0;
		
		/*
		man  =jandon/10000;
		chon =(jandon-man*10000)/1000;
		back =(jandon-man*10000-chon*1000)/100;
		sib	 =(jandon-man*10000-chon*1000-back*100)/10;
		
		*/
		man =jandon/10000;
		chon=jandon%10000/1000;
		back=jandon%1000/100;
		sib=jandon%100/10;
		
				
		System.out.println("만원 : "+man+" 장");
		System.out.println("천원 : "+chon+" 장");
		System.out.println("백원 :"+back+" 개");
		System.out.println("십원 :"+sib+" 개");
		
		 int[] coinUnit = {10000, 1000, 100, 10 };
		    
		    System.out.println("money=" + jandon);
		    for (int i = 0; i < coinUnit.length; i++) {
		        System.out.println(coinUnit[i]+"원: "+ jandon / coinUnit[i]);
		        jandon%= coinUnit[i];
		    }
		    System.out.println("Finish");
	}
	
	
}
