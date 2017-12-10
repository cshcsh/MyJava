package com.java5200.date0606;

enum Color4 {
	RED, GREEN, BLUE; // 定义枚举的三个类型
	private String name; // 定义name属性

	public String getName() {
		return name;
	}

	public void setName(String name) {
		switch(this){
			case RED:{ // 判断是否是红色
				if("红色".equals(name)){
					this.name = name ; // 设置名称
				}else{
					System.out.println("设置内容错误。") ;
				}
				break ;
			}
			case GREEN:{ // 判断是否是红色
				if("绿色".equals(name)){
					this.name = name ; // 设置名称
				}else{
					System.out.println("设置内容错误。") ;
				}
				break ;
			}
			case BLUE:{ // 判断是否是红色
				if("蓝色".equals(name)){
					this.name = name ; // 设置名称
				}else{
					System.out.println("设置内容错误。") ;
				}
				break ;
			}
			default:{
				System.out.println("错误");
				break;
			}
		}
	}
}

public class EnumTest4 {

	public static void main(String[] args) {
		Color4.RED.setName("红色");
		Color4.BLUE.setName("蓝色");
		Color4.GREEN.setName("绿色");
		for(Color4 c:Color4.values()){ //枚举.values()表示得到全部枚举的内容
			/*c.setName("红色");
			c.setName("绿色");
			c.setName("蓝色");*/
			System.out.println(c.ordinal()
					+ " --> " + c.name()//枚举名字
					+ "(" + c.getName() + ")") ;// 输出枚举设置名字
		}
		/*for(Color4 c:Color4.values()){ //枚举.values()表示得到全部枚举的内容
			System.out.println(c.ordinal()
					+ " --> " + c.name()//枚举名字
					+ "(" + c.getName() + ")") ;// 输出枚举设置名字
		}*/
	}
}
