package com.java5200.date0613;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * •用List方法,存储10个1-50(含50)的随机偶数元素, 
 * 要求数字不能重复,添加完成后从大到小倒序遍历输出到
 * 控制台并使用IO流将集合中的元素按指定格式输出到当 
 * 前项目的num.txt中,例如:48,44,40,38,34,30,26......
 */
public class Test06 {

	public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<Integer>();
        Random  r = new Random();
        int i;
        //添加10个随机不重复偶数
        while(list.size() <= 10){
            i = r.nextInt(50)+1;
            if(!list.contains(i)&&i%2==0){
                list.add(i);
            }
        }

		//排序
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1<o2){
					return 1;
				}else if(o1>o2){
					return -1;
				}else{
					return 0;
				}
			}
			
		});
		
		//输出到控制台
		StringBuffer stringBuffer = new StringBuffer();
		for(int j=0;j<list.size();j++){
			System.out.print(list.get(j)+" ");
			stringBuffer.append(list.get(j)+",");
		}

		// 输出到num.txt
		OutputStream outputStream = new FileOutputStream("num.txt");
		outputStream.write(stringBuffer.toString().getBytes("utf-8"));
		outputStream.close();
	}
	
}
