package com.java5200.date0531;

import java.io.IOException;

class A1 {

	public void methodA() throws Exception { //……
	
	}
}

public class A extends A1 {
	
	public void methodA() throws IOException { //报错,重写方法不能抛出比被重写方法范围更大的异常类型
		//……
	}
}
