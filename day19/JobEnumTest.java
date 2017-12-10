package com.java5200.date0606;

enum Job {
	TEACHER("��ʦ",23), POLICE("����",23), STUDENT("ѧ��",3); // ����ö�ٵ���������
	
	private String jobName ; // ����name����
	private int jobYear;
	
	private Job(String jobName, int jobYear) {
		this.jobName = jobName;
		this.jobYear = jobYear;
	}
	
	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public int getJobYear() {
		return jobYear;
	}

	public void setJobYear(int jobYear) {
		this.jobYear = jobYear;
	}

	public static void display(Job c){
		System.out.println(c.ordinal()
				+ " --> " + c.name()//ö������
				+ "(" + c.getJobName() + ")"
				+ "(" + c.getJobYear() + ")") ;
	}
}

public class JobEnumTest {
	
	public static void main(String[] args) {
		for(Job c:Job.values()){ //ö��.values()��ʾ�õ�ȫ��ö�ٵ�����
			Job.display(c);
		}
	}
}

