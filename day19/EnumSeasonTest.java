package com.java5200.date0606;

/**
 * 使用 enum 定义的枚举类默认继承了java.lang.Enum 类 ,枚举类的构造器只能使用 private 访问控制符
 * @author CSH
 * @date 2018年6月6日下午9:23:10
 */
enum Season {
	SPRING("春天","春风又绿江南岸"), SUMMER("夏天","映日荷花别样红"), AUTUMN("秋天","秋水共长天一色"),WINTER("冬天","寒窗西岭千秋雪"); // 定义枚举的四个类型
	private Season(String name,String dec){ // 定义构造方法
		this.setName(name) ; // 设置名字
		this.setDec(dec) ; //设置描述
	}
	private String name ; // 定义name属性
	private String dec ;	//定义dec属性
	public String getName() { // 取得name属性
		return name;
	}
	public void setName(String name) { // 设置name属性
		this.name = name;
	}
	public String getDec() {
		return dec;
	}
	public void setDec(String dec) {
		this.dec = dec;
	}
	
}

public class EnumSeasonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Season c:Season.values()){ //枚举.values()表示得到全部枚举的内容
			System.out.println(c.ordinal()
					+ " --> " + c.name()
					+ "(" + c.getName() + ")"
					+ "(" + c.getDec() + ")") ;
			
		}
	}

}
