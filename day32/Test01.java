package com.java5200.date0619;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * •编写一个接收网络地址的方法,打印输出该网络所在 的主页文件内容,并提取网页中的图片,将图片保存 在本地的一个文件夹中。
 * •例如：传递http://jwc.jxau.edu.cn/在控制台打印出 该网站首页的HTML文本内容,在打印输出内容的同
 * 时提取网页中的图片地址,再通过IO流保存图片到本 地。
 * @author CSH
 * @date 2018年6月19日下午8:33:09
 */
public class Test01 {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://jwc.jxau.edu.cn/"); // 指定操作的URL
		URLConnection urlConnection = url.openConnection();
		InputStream inputStream = urlConnection.getInputStream();// 打开输入流,读取URL内容
		byte[] b = new byte[1024];
		int n = 0;
		StringBuffer stringBuffer = new StringBuffer();
		while ((n = inputStream.read(b, 0, b.length)) > 0) {
			stringBuffer.append(new String(b, "utf-8"));
		}
		inputStream.close();
		System.out.println(stringBuffer);
		List<String> imgUrl = getURL(stringBuffer.toString());
		List<String> imgSrc = getSrc(imgUrl);
		download(imgSrc);

	}

	private static void download(List<String> imgSrc) throws IOException {
		// TODO Auto-generated method stub
		for (String url : imgSrc) {
			String imgName = url.substring(url.lastIndexOf("/") + 1, url.length());
			URL url2 = new URL(url);
			InputStream inputStream = url2.openStream();
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\img\\"+imgName);
			byte[] bs = new byte[1024];
			int n = 0;
			System.out.println("正在下载：" + url);
			while ((n = inputStream.read(bs, 0, bs.length)) > 0) {
				fileOutputStream.write(bs, 0, n);

			}
			inputStream.close();
			fileOutputStream.close();
			System.out.println("图片：" + imgName + "下载已经完成");
		}
	}

	private static List<String> getSrc(List<String> imgUrl) {
		// TODO Auto-generated method stub
		List<String> src = new ArrayList<String>();
		for (String img : imgUrl) {
			Matcher matcher = Pattern.compile("http:\"?(.*?)(\"|>|\\s+)").matcher(img);
			while (matcher.find()) {
				src.add(matcher.group().substring(0, matcher.group().length() - 1));

			}
		}
		return src;
	}

	private static List<String> getURL(String string) {
		// TODO Auto-generated method stub
		Matcher matcher = Pattern.compile("<img.*src=(.*?)[^>]*?>").matcher(string);
		List<String> url = new ArrayList<String>();
		while (matcher.find()) {
			url.add(matcher.group());
		}
		return url;
	}

}
