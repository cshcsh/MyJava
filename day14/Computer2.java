package com.java5200.date0601;

class CPU2 {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	private float pingLu;//Ƶ��
	
	public CPU2(String pingPai, String xinHao, float pingLu) {
		super();
		this.pingPai = pingPai;
		this.xinHao = xinHao;
		this.pingLu = pingLu;
	}

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

	public float getPingLu() {
		return pingLu;
	}

	public void setPingLu(float pingLu) {
		this.pingLu = pingLu;
	}

	public void jiSuan() {

		System.out.println("64λ����");
	}

	@Override
	public String toString() {
		return "\nCPU�� Ʒ����" + pingPai + ", �ͺ���" + xinHao + ", ��Ƶ��" + pingLu + "Ghz\n";
	}
	
}

class YingPan2 {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	private float rongLiang;//����
	
	public YingPan2(String pingPai, String xinHao, float rongLiang) {
		super();
		this.pingPai = pingPai;
		this.xinHao = xinHao;
		this.rongLiang = rongLiang;
	}

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

	@Override
	public String toString() {
		return "Ӳ�̣� Ʒ����" + pingPai + ", �ͺ���" + xinHao + ", ������" + rongLiang + "G\n";
	}
	
}

class XingShiQi2 {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	private String fengBianLu;//�ֱ���
	
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

	public String getFengBianLu() {
		return fengBianLu;
	}

	public void setFengBianLu(String fengBianLu) {
		this.fengBianLu = fengBianLu;
	}

	public XingShiQi2(String pingPai, String xinHao, String fengBianLu) {
		super();
		this.pingPai = pingPai;
		this.xinHao = xinHao;
		this.fengBianLu = fengBianLu;
	}

	public void xiangShi() {
		
		System.out.println("900*1200�ֱ���");
	}

	@Override
	public String toString() {
		return "��ʾ���� Ʒ����" + pingPai + ", �ͺ���" + xinHao + ", �ֱ�����" + fengBianLu + "\n";
	}
	
}

class KeyWord2 {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	
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

	public KeyWord2(String pingPai, String xinHao) {
		super();
		this.pingPai = pingPai;
		this.xinHao = xinHao;
	}

	public void shuRu() {

		System.out.println("��������");
	}

	@Override
	public String toString() {
		return "���̣� Ʒ����" + pingPai + ", �ͺ���" + xinHao + "\n";
	}
	
}

public class Computer2 {

	private String pingPai;//Ʒ��
	private String xinHao;//�ͺ�
	private CPU2 cpu;//cpu
	private YingPan2 yingPan;//Ӳ��
	private XingShiQi2 xingShiQi;//��ʾ��
	private KeyWord2 keyWord;//����
	
	public Computer2(String pingPai, String xinHao, CPU2 cpu, YingPan2 yingPan, XingShiQi2 xingShiQi,
			KeyWord2 keyWord) {
		super();
		this.pingPai = pingPai;
		this.xinHao = xinHao;
		this.cpu = cpu;
		this.yingPan = yingPan;
		this.xingShiQi = xingShiQi;
		this.keyWord = keyWord;
	}

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

	@Override
	public String toString() {
		return "���ԣ� Ʒ����" + pingPai + ", �ͺ���" + xinHao  + cpu  + yingPan
				+ xingShiQi + keyWord;
	}
	
}
