package com.java5200.date0524;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student=new Student("1234","csh");
		int[] scores={99,66,77};
		student.setScores(scores);
		System.out.println("ѧ�ţ�"+student.getId()+"   ������"+student.getName());
		student.sum();
		student.aver();
		student.max();
		student.min();
	}

}
