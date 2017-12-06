package com.java5200.date0601;

class CPU {

	private String pingPai;//品牌
	private String xinHao;//型号
	private String pingLu;//频率
	
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

		System.out.println("64位计算");
	}

}

class YingPan {

	private String pingPai;//品牌
	private String xinHao;//型号
	private float rongLiang;//容量
	
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

		System.out.println("3.0读");
	}

	public void write() {

		System.out.println("3.0写");
	}

}

class XingShiQi {

	private String pingPai;//品牌
	private String xinHao;//型号
	private float fengBianLu;//分辨率

	public void xiangShi() {
		
		System.out.println("900*1200分辨率");
	}

}

class KeyWord {

	private String pingPai;//品牌
	private String xinHao;//型号

	public void shuRu() {

		System.out.println("键盘输入");
	}

}

public class Computer {

	private String pingPai;//品牌
	private String xinHao;//型号
	private CPU cpu;//cpu
	private YingPan yingPan;//硬盘
	private XingShiQi xingShiQi;//显示器
	private KeyWord keyWord;//键盘

	public void shuRu() {
		
		System.out.println("计算机输入");
	}

	public void shuChu() {

		System.out.println("计算机输出");
	}

	public void Baocun() {

		System.out.println("保存");
	}

	public void read() {

		System.out.println("计算机读数据");
	}
	
	public void yunSuan(){
		
		System.out.println("计算机运算");
	}
}
