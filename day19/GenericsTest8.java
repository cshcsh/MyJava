package com.java5200.date0606;

class Info9<T, V> { // 指定两个泛型类型

	private T var;
	private V age;
	public T getVar() {
		return var;
	}
	public void setVar(T var) {
		this.var = var;
	}
	public V getAge() {
		return age;
	}
	public void setAge(V age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Info9 [Var=" + var + ", age=" + age + "]";
	}
	public Info9(T var, V age) {
		super(); 
		this.var = var;
		this.age = age;
	}
	
	
}

class Demo9<S> {

	private S o;

	public S getO() {
		return o;
	}

	public void setO(S o) {
		this.o = o;
	}

	@Override
	public String toString() {
		return "Demo9 [o=" + o + "]";
	}

	public Demo9(S o) {
		super();
		this.o = o;
	}
	
}


public class GenericsTest8 {
	public static void main(String args[]) {
		Demo9<Info9<String, Integer>> d = null;// 将Info作为Demo的泛型类型
		Info9<String, Integer> i = null;// Info要指定两个泛型类型
		i = new Info9<String, Integer>("李小龙", 30);
		d = new Demo9<Info9<String, Integer>>(i);// 在Demo类中设置Info类对象
		System.out.println("内容一：" + d.getO().getVar());
		System.out.println("内容二：" + d.getO().getAge());
	}

}
