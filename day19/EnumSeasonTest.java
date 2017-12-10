package com.java5200.date0606;

/**
 * ʹ�� enum �����ö����Ĭ�ϼ̳���java.lang.Enum �� ,ö����Ĺ�����ֻ��ʹ�� private ���ʿ��Ʒ�
 * @author CSH
 * @date 2018��6��6������9:23:10
 */
enum Season {
	SPRING("����","�������̽��ϰ�"), SUMMER("����","ӳ�պɻ�������"), AUTUMN("����","��ˮ������һɫ"),WINTER("����","��������ǧ��ѩ"); // ����ö�ٵ��ĸ�����
	private Season(String name,String dec){ // ���幹�췽��
		this.setName(name) ; // ��������
		this.setDec(dec) ; //��������
	}
	private String name ; // ����name����
	private String dec ;	//����dec����
	public String getName() { // ȡ��name����
		return name;
	}
	public void setName(String name) { // ����name����
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

		for(Season c:Season.values()){ //ö��.values()��ʾ�õ�ȫ��ö�ٵ�����
			System.out.println(c.ordinal()
					+ " --> " + c.name()
					+ "(" + c.getName() + ")"
					+ "(" + c.getDec() + ")") ;
			
		}
	}

}
