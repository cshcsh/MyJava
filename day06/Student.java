package com.java5200.date0524;

public class Student {

	private String id;
	private String name;
	private int[] scores=new int[3];//��ѧ��Ӣ�������ɼ�
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void sum(){//�ܷ�
		int sum=0;
		for(int i=0;i<3;i++){
			sum+=scores[i];
		}
		System.out.println("�ܷ�:"+sum);
	}
	public void aver(){//ƽ����
		float sum=0;
		for(int i=0;i<3;i++){
			sum+=scores[i];
		}
		System.out.println("ƽ����:"+sum/3);
	}
	public void min(){//��ͷ�
		int min=scores[0];
		for(int i=1;i<3;i++){
			if(min>scores[i]){
				min=scores[i];
			}
		}
		System.out.println("��ͷ�:"+min);
	}
	public void max(){//��߷�
		int max=0;
		for(int i=0;i<3;i++){
			if(max<scores[i]){
				max=scores[i];
			}
		}
		System.out.println("��߷�:"+max);
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
