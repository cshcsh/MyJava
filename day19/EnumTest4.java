package com.java5200.date0606;

enum Color4 {
	RED, GREEN, BLUE; // ����ö�ٵ���������
	private String name; // ����name����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		switch(this){
			case RED:{ // �ж��Ƿ��Ǻ�ɫ
				if("��ɫ".equals(name)){
					this.name = name ; // ��������
				}else{
					System.out.println("�������ݴ���") ;
				}
				break ;
			}
			case GREEN:{ // �ж��Ƿ��Ǻ�ɫ
				if("��ɫ".equals(name)){
					this.name = name ; // ��������
				}else{
					System.out.println("�������ݴ���") ;
				}
				break ;
			}
			case BLUE:{ // �ж��Ƿ��Ǻ�ɫ
				if("��ɫ".equals(name)){
					this.name = name ; // ��������
				}else{
					System.out.println("�������ݴ���") ;
				}
				break ;
			}
			default:{
				System.out.println("����");
				break;
			}
		}
	}
}

public class EnumTest4 {

	public static void main(String[] args) {
		Color4.RED.setName("��ɫ");
		Color4.BLUE.setName("��ɫ");
		Color4.GREEN.setName("��ɫ");
		for(Color4 c:Color4.values()){ //ö��.values()��ʾ�õ�ȫ��ö�ٵ�����
			/*c.setName("��ɫ");
			c.setName("��ɫ");
			c.setName("��ɫ");*/
			System.out.println(c.ordinal()
					+ " --> " + c.name()//ö������
					+ "(" + c.getName() + ")") ;// ���ö����������
		}
		/*for(Color4 c:Color4.values()){ //ö��.values()��ʾ�õ�ȫ��ö�ٵ�����
			System.out.println(c.ordinal()
					+ " --> " + c.name()//ö������
					+ "(" + c.getName() + ")") ;// ���ö����������
		}*/
	}
}
