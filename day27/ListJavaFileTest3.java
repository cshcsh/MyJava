package com.java5200.date0614;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 列出指定目录的全部*.java
 * 
 * @author CSH
 * @date 2018年6月14日下午3:04:15
 */
public class ListJavaFileTest3 {

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
			} else {
				System.out.println(file);
			}
		}
	}

	FilenameFilter fileNameFilter = new FilenameFilter() {

		@Override
		public boolean accept(File dir, String name) {
			if (name.lastIndexOf('.') > 0) {
				int lastIndex = name.lastIndexOf('.');

				String str = name.substring(lastIndex);

				if (str.equals(".txt")) {
					return true;
				}
			}
			return false;
		}
	};
	
	FileFilter fileFilter = new FileFilter() {

		@Override
		public boolean accept(File dir) {
			/*if (dir.lastIndexOf('.') > 0) {
				int lastIndex = dir.lastIndexOf('.');

				String str = dir.substring(lastIndex);

				if (str.equals(".txt")) {
					return true;
				}
			}*/
			return false;
		}
	};
}
