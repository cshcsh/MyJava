package com.java5200.date0530;

interface Network { // 定义Network接口
	public void browse(); // 定义浏览的抽象方法
}

class Real implements Network { // 真实的上网操作
	public void browse() { // 重写抽象方法
		System.out.println("上网浏览信息");
	}
}

class Proxy implements Network { // 代理上网
	private Network network;

	public Proxy(Network network) { // 设置代理的真实操作
		this.network = network; // 设置代理的子类
	}

	public void check() { // 与具体上网相关的操作
		System.out.println("检查用户是否合法");
	}

	public void browse() {
		this.check(); // 可以同时调用多个与具体业务相关的操作
		this.network.browse(); // 调用真实上网操作
	}
}

public class ProxyTest {

	public static void main(String[] args){
		
		Real real=new Real();
		Proxy proxy=new Proxy(real);
		proxy.browse();
	}
	
}