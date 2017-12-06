package com.java5200.date0601;

class MyTime {
	
	private int hour;
	private int minute;
	private int second;

	public MyTime() {
		super();
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		// TODO Auto-generated constructor stub
	}

	public void addHour(int hour) {
		if(hour>=0){
			if((this.hour+hour)>=24){
				this.hour=(this.hour+hour)%24;
			}else{
				this.hour=this.hour+hour;
			}
		}else{
			System.out.println("hour´íÎó");
		}
	}

	public void subHour(int hour) {
		if(hour>=0){
			if(this.hour<hour){
				this.hour=(hour-this.hour)%24;
			}else{
				this.hour=this.hour-hour;
			}
		}else{
			System.out.println("hour´íÎó");
		}
	}
	
	public void addMinute(int minute) {
		if(minute>=0){
			if((this.minute+minute)>=60){
				int n=(this.minute+minute)/60;
				this.hour=this.hour+n;
				this.minute=(this.minute+minute)%60;
			}else{
				this.minute=this.minute+minute;
			}
		}else{
			System.out.println("minute´íÎó");
		}
	}

	public void subMinute(int minute) {
		if(minute>=0){
			if(this.minute<minute){
				int n=minute/60;
				this.hour=this.hour-n;//¿¼ÂÇnºÜ´óÊ±
				this.minute=(minute-this.minute)%60;
			}else{
				this.minute=this.minute-minute;
			}
		}else{
			System.out.println("minute´íÎó");
		}
	}
	
	public void addSecond(int second) {
		if(second>=0){
			if((this.second+second)>=60){
				int n=(this.second+second)/60;
				this.minute=this.minute+n;
				this.second=(this.second+second)%60;
			}else{
				this.second=this.second+second;
			}
		}else{
			System.out.println("second´íÎó");
		}
	}

	public void subSecond(int second) {
		if(second>=0){
			if(this.second<second){
				int n=second/60;
				if(n>60){
					n=n/60;
				}
				this.minute=this.minute-n;//¿¼ÂÇnºÜ´óÊ±
				this.second=(second-this.second)%60;
			}else{
				this.second=this.second-second;
			}
		}else{
			System.out.println("second´íÎó");
		}
	}

	@Override
	public String toString() {
		return "Ê±¼ä£º " + hour + ":" + minute + ":" + second;
	}

	public void display() {
		System.out.println(toString());
	}
}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTime myTime = new MyTime();
		myTime.display();
		myTime.addHour(6);
		myTime.addMinute(227);
		myTime.addSecond(144);
		myTime.display();
		
		myTime.subHour(555);
		myTime.subMinute(44);
		myTime.subSecond(7777);
		myTime.display();
	}

}
