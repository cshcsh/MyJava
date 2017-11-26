package com.java5200.date0521;

public class Vampire{

	public static void main(String[] args){
		
		for(int i=1001;i<=9999;i++){
			int a=i/1000;
			int b=(i-a*1000)/100;
			int c=(i-a*1000-b*100)/10;
			int d=i-a*1000-b*100-c*10;

			if(i==((a*10+b)*(c*10+d))){

					System.out.println(i);
			}
			if(i==((a*10+b)*(d*10+d))){

					System.out.println(i);
			}
			if(i==((a*10+c)*(b*10+d))){

					System.out.println(i);
			}
			if(i==((a*10+c)*(d*10+b))){

					System.out.println(i);
			}
			if(i==((a*10+d)*(b*10+c))){

					System.out.println(i);
			}
			if(i==((a*10+d)*(c*10+b))){

					System.out.println(i);
			}
			if(i==((b*10+a)*(c*10+d))){

					System.out.println(i);
			}
			if(i==((b*10+a)*(d*10+c))){

					System.out.println(i);
			}
			if(i==((b*10+c)*(d*10+a))){

					System.out.println(i);
			}
			if(i==((b*10+d)*(c*10+a))){

					System.out.println(i);
			}
			if(i==((c*10+a)*(d*10+b))){

					System.out.println(i);
			}
			if(i==((c*10+b)*(d*10+a))){

					System.out.println(i);
			}
		}
	}
}

	
