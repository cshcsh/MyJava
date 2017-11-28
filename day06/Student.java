package com.java5200.date0524;

public class Student {

	private String id;
	private String name;
	private int[] scores=new int[3];//数学，英语，计算机成绩
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void sum(){//总分
		int sum=0;
		for(int i=0;i<3;i++){
			sum+=scores[i];
		}
		System.out.println("总分:"+sum);
	}
	public void aver(){//平均分
		float sum=0;
		for(int i=0;i<3;i++){
			sum+=scores[i];
		}
		System.out.println("平均分:"+sum/3);
	}
	public void min(){//最低分
		int min=scores[0];
		for(int i=1;i<3;i++){
			if(min>scores[i]){
				min=scores[i];
			}
		}
		System.out.println("最低分:"+min);
	}
	public void max(){//最高分
		int max=0;
		for(int i=0;i<3;i++){
			if(max<scores[i]){
				max=scores[i];
			}
		}
		System.out.println("最高分:"+max);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	
}
