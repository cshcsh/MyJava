package com.java5200.date0619;

import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=ͼƬ&step_word=&hs=0&pn=0&spn=0&di=101451398840&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1345516462%2C1963865483&os=580543819%2C3150294467&simid=0%2C0&adpicid=0&lpn=0&ln=1980&fr=&fmq=1529392455375_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic.58pic.com%2F58pic%2F16%2F06%2F72%2F87a58PICWRj_1024.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bcbrtv_z%26e3Bv54AzdH3Frf1AzdH3F8mam0db0_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0&islist=&querylist=");
		System.out.println("Protocol: " + url.getProtocol());
		System.out.println("Port: " + url.getPort());
		System.out.println("Host: " + url.getHost());
		System.out.println("File: " + url.getFile());
		System.out.println("Ext:" + url.toExternalForm());
	}
}
