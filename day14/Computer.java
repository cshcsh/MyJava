package com.java5200.date0601;

class CPU {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	private String pingLu;//Ƶ��
	
	public String getPingPai() {
		return pingPai;
	}

	public void setPingPai(String pingPai) {
		this.pingPai = pingPai;
	}

	public String getXinHao() {
		return xinHao;
	}

	public void setXinHao(String xinHao) {
		this.xinHao = xinHao;
	}

	public String getPingLu() {
		return pingLu;
	}

	public void setPingLu(String pingLu) {
		this.pingLu = pingLu;
	}

	public void jiSuan() {

		System.out.println("64λ����");
	}

}

class YingPan {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	private float rongLiang;//����
	
	public String getPingPai() {
		return pingPai;
	}

	public void setPingPai(String pingPai) {
		this.pingPai = pingPai;
	}

	public String getXinHao() {
		return xinHao;
	}

	public void setXinHao(String xinHao) {
		this.xinHao = xinHao;
	}

	public float getRongLiang() {
		return rongLiang;
	}

	public void setRongLiang(float rongLiang) {
		this.rongLiang = rongLiang;
	}

	public void read() {

		System.out.println("3.0��");
	}

	public void write() {

		System.out.println("3.0д");
	}

}

class XingShiQi {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	private float fengBianLu;//�ֱ���

	public void xiangShi() {
		
		System.out.println("900*1200�ֱ���");
	}

}

class KeyWord {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�

	public void shuRu() {

		System.out.println("��������");
	}

}

public class Computer {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	private CPU cpu;//cpu
	private YingPan yingPan;//Ӳ��
	private XingShiQi xingShiQi;//��ʾ��
	private KeyWord keyWord;//����

	public void shuRu() {
		
		System.out.println("���������");
	}

	public void shuChu() {

		System.out.println("��������");
	}

	public void Baocun() {

		System.out.println("����");
	}

	public void read() {

		System.out.println("�����������");
	}
	
	public void yunSuan(){
		
		System.out.println("���������");
	}
}
