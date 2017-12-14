package com.java5200.date0608;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest extends TimerTask {

	public void run() {
		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println("当前系统时间为：" + sdf.format(new Date()));
	}
	public static void main(String[] args) {
		Timer t = new Timer(); // 建立Timer类对象
		TimerTest mytask = new TimerTest(); // 定义任务
		t.schedule(mytask, 1000, 2000);// 设置任务的执行1秒后开始 每2秒重复
	}
}

