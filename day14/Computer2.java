package com.java5200.date0601;

class CPU2 {

	private String pingPai;//品牌
	private String xinHao;//型号
	private float pingLu;//频率
	
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

		System.out.println("64位计算");
	}

	@Override
	public String toString() {
		return "\nCPU： 品牌是" + pingPai + ", 型号是" + xinHao + ", 主频是" + pingLu + "Ghz\n";
	}
	
}

class YingPan2 {

	private String pingPai;//品牌
	private String xinHao;//型号
	private float rongLiang;//容量
	
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

		System.out.println("3.0读");
	}

	public void write() {

		System.out.println("3.0写");
	}

	@Override
	public String toString() {
		return "硬盘： 品牌是" + pingPai + ", 型号是" + xinHao + ", 容量是" + rongLiang + "G\n";
	}
	
}

class XingShiQi2 {

	private String pingPai;//品牌
	private String xinHao;//型号
	private String fengBianLu;//分辨率
	
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
		
		System.out.println("900*1200分辨率");
	}

	@Override
	public String toString() {
		return "显示器： 品牌是" + pingPai + ", 型号是" + xinHao + ", 分辨率是" + fengBianLu + "\n";
	}
	
}

class KeyWord2 {

	private String pingPai;//品牌
	private String xinHao;//型号
	
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

		System.out.println("键盘输入");
	}

	@Override
	public String toString() {
		return "键盘： 品牌是" + pingPai + ", 型号是" + xinHao + "\n";
	}
	
}

public class Computer2 {

	private String pingPai;//品牌
	private String xinHao;//型号
	private CPU2 cpu;//cpu
	private YingPan2 yingPan;//硬盘
	private XingShiQi2 xingShiQi;//显示器
	private KeyWord2 keyWord;//键盘
	
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

	@Override
	public String toString() {
		return "电脑： 品牌是" + pingPai + ", 型号是" + xinHao  + cpu  + yingPan
				+ xingShiQi + keyWord;
	}
	
}
