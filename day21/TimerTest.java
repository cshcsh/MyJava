package com.java5200.date0608;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest extends TimerTask {

	public void run() {
		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println("��ǰϵͳʱ��Ϊ��" + sdf.format(new Date()));
	}
	public static void main(String[] args) {
		Timer t = new Timer(); // ����Timer�����
		TimerTest mytask = new TimerTest(); // ��������
		t.schedule(mytask, 1000, 2000);// ���������ִ��1���ʼ ÿ2���ظ�
	}
}

