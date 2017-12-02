package com.java5200.date0528;

class Mankind2 {

	private int sex;
	private int salary;
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void manOrworman(){
		if(sex==1){
			System.out.println("man");
		}else if (sex==0) {
			System.out.println("worman");
		}else{
			System.out.println("ÈËÑý");
		}
	}
	public void employeed(){
		if(salary==0){
			System.out.println("no job");
		}else{
			System.out.println("job");
		}
	}
	
}
public class Kids2 extends Mankind2{
	
	private int yearsOld;
	
	public void employeed(){
		System.out.println("Kids should study and no job");
	}
	public int getYearsOld() {
		return yearsOld;
	}
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	public void printAge(){
		System.out.println(yearsOld);
	}
	public static void main(String[] args){
		Kids2 kids=new Kids2();
		kids.setSalary(1000);
		kids.setSex(1);
		kids.setYearsOld(22);
		kids.manOrworman();;
		kids.employeed();
		kids.printAge();
		
	}
}