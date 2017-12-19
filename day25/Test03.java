package com.java5200.date0612;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用迭代输出Collection(List,Set等)中的全部内容•使用Iterator删除指定内容
 * 
 * @author CSH
 * @date 2018年6月12日下午5:22:19
 */
public class Test03 {

	public static void main(String[] args){
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("bc");
		list.add("d");
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Iterator iterator2=list.iterator();
		while(iterator2.hasNext()){
			String string=(String) iterator2.next();
			if("d".equals(string)){
				iterator2.remove();
			}else{
				System.out.println(string);
			}
		}
	}
}
