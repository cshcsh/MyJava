package com.java5200.date0614;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * •试着学习使用压缩流,在Java中实现ZIP的压缩需要导 入java.util.zip包,
 * 使用此包中的ZipFile、ZipOutputStream、ZipInputStream、
 * ZipEntry几个类 完成一个文件压缩解压的示例。
 * 
 * @author CSH
 * @date 2018年6月14日下午5:14:00
 */
public class Test07 {

	public static void main(String args[]) throws Exception {
		
		OutputStream outputStream = new FileOutputStream("testZip.zip");
		CheckedOutputStream cos = new CheckedOutputStream(outputStream, new CRC32());
		ZipOutputStream zos = new ZipOutputStream(cos);
		File file = new File("test02.txt");
		ZipFile(zos, file);
		zos.close();
		cos.close();
		outputStream.close();
		System.out.println("压缩完成");
	}

	public static void ZipFile(ZipOutputStream zos, File file) throws Exception {
		if (file.isDirectory()) {
			zos.putNextEntry(new ZipEntry(file.getPath().substring(file.getPath().indexOf("test02.txt")) + File.separator));
			for (File f : file.listFiles()) {
				ZipFile(zos, f);
			}
		} else {
			System.out.println("正在压缩文件:" + file.getName());
			zos.putNextEntry(new ZipEntry(file.getPath().substring(file.getPath().indexOf("test02.txt"))));
			InputStream is = new FileInputStream(file.getPath());
			BufferedInputStream bis = new BufferedInputStream(is);
			byte[] b = new byte[1024];
			while (bis.read(b) != -1) {
				zos.write(b);
			}
			bis.close();
			is.close();
		}
	}
}
