package com.iu.Study4.s2;

public class Student {
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	//매서드병 cal
	//해당 인스턴스의 total, avg계산해서 대입
	public void cal() {
		this.total=this.kor+this.eng+this.math;
		this.avg= this.total/3;
	}
	
}
