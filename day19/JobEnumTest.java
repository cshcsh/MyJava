package com.java5200.date0606;

enum Job {
	TEACHER("教师",23), POLICE("警察",23), STUDENT("学生",3); // 定义枚举的三个类型
	
	private String jobName ; // 定义name属性
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
				+ " --> " + c.name()//枚举名字
				+ "(" + c.getJobName() + ")"
				+ "(" + c.getJobYear() + ")") ;
	}
}

public class JobEnumTest {
	
	public static void main(String[] args) {
		for(Job c:Job.values()){ //枚举.values()表示得到全部枚举的内容
			Job.display(c);
		}
	}
}

