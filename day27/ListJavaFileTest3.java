package com.java5200.date0614;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * �г�ָ��Ŀ¼��ȫ��*.java
 * 
 * @author CSH
 * @date 2018��6��14������3:04:15
 */
public class ListJavaFileTest3 {

	public static void main(String args[]) {
		File my = new File("IOTest" + File.separator); // ����·��
		print(my);
	}

	public static void print(File file) { // �ݹ���ô˷���
		if (file != null) { // ����һ��������
			if (file.isDirectory()) { // �ж��Ƿ���Ŀ¼
				// �����Ŀ¼,���г�ȫ������
				File f[] = file.listFiles();
				if (f != null) {// �п����޷��г�Ŀ¼�е��ļ�
					for (int i = 0; i < f.length; i++) {
						print(f[i]);// �����г�����
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
