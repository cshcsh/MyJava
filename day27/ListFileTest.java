package com.java5200.date0614;

import java.io.File;

/**
 * 列出指定目录的全部内容
 * 
 * @author CSH
 * @date 2018年6月14日下午3:04:15
 */
public class ListFileTest {

	public static void main(String args[]) {
		File my = new File("IOTest" + File.separator); // 操作路径
		print(my);
	}

	public static void print(File file) { // 递归调用此方法
		if (file != null) { // 增加一个检查机制
			if (file.isDirectory()) { // 判断是否是目录
				// 如果是目录,则列出全部内容
				File f[] = file.listFiles();
				if (f != null) {// 有可能无法列出目录中的文件
					for (int i = 0; i < f.length; i++) {
						print(f[i]);// 继续列出内容
					}
				}
			} else {// 如果不是目录,则直接打印路径信息
				System.out.println(file);
			}
		}
	}
}
