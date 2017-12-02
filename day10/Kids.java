package com.java5200.date0528;

class Mankind {

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
public class Kids extends Mankind{
	
	private int yearsOld;
	
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
		Kids someKid=new Kids();
		someKid.setSalary(1000);
		someKid.setSex(1);
		someKid.setYearsOld(22);
		someKid.manOrworman();;
		someKid.employeed();
		someKid.printAge();
		
	}
}