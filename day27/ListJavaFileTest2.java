package com.java5200.date0614;

import java.io.File;

/**
 * �г�ָ��Ŀ¼��ȫ��*.java
 * 
 * @author CSH
 * @date 2018��6��14������3:04:15
 */
public class ListJavaFileTest2 {

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
			} else if (file.getName().endsWith(".java")){
				System.out.println(file);
			}
		}
	}
}