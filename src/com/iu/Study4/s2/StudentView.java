package com.iu.Study4.s2;

public class StudentView {
	
	public void view(Student student) {
		
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);
		
	}
	
	public void view(Student [] students) {
		
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
//			System.out.println(student.name);
//			System.out.println(student.num);
//			System.out.println(students[i].avg);
			this.view(student);
			
			System.out.println("=====================================");
		}
	}
}
