package com.java5200.date0604;


/**
 * 获取两个字符串中最大相同子串
 * @author CSH
 * @date 2018年6月5日上午10:11:39
 */
public class StringMax2 {  
    
	public static void main(String[] args) {  
        sonStringOperation();  
    }  
    private static void sonStringOperation() {  
        String s2 = "asdfkljasdCCTVCCTVfioejsdfunbsdfhh";  
        String s = "asdfkasdiCCTVCCTVufasdfjh";  
        String temp; // 用来交换字符串，使s.length()>s2.length  
        String s3;// 用于存储截取后的字符串  
        if (s.length() < s2.length()) {//比较s与s2长度，将较长的字符串赋给s  
            temp = s2;  
            s2 = s;  
            s = temp;  
        }  
        int count = s2.length();//将较短字符串的长度赋值给count  
        int sum = (count + 1) * count / 2;//计算得出所有可能结果的最大值sum  
        String[] sonArray = new String[sum];//分配sum个空间给sonArray数组  
        int arrIndex = 0;//sonArray数组下标  
        if (s.indexOf(s2) != -1) {//如果s2为s的子字符串  
            System.out.println("最大子字符串为" + s2);  
        } else if (s.indexOf(s2) == -1) {  
            for (int i = 0; i < s2.length(); i++) {  
                for (int j = s2.length(); j > i; j--) {  
                    s3 = s2.substring(i, j);//将截取后的字符串赋值给s3  
                    if (s.indexOf(s3) != -1) {  
                        //如果s3为s的子字符串，则将s3置入sonArray数组中  
                        sonArray[arrIndex] = s3;  
                        arrIndex++;  
                    }  
                }  
            }  
            if (sonArray[0] == null) {//如果sonArray数组为空  
                System.out.println("两个字符串之间没有相同的子字符串！");  
                return;  
            }  
            String compareTemp = null;  
            //遍历sonArray数组，将最大长度的字符串赋值给sonArray数组的第一个值  
            for (int compareIndex = 1; compareIndex < arrIndex; compareIndex++) {  
                // System.out.println(sonArray[i]);  
                if (sonArray[0].length() < sonArray[compareIndex].length()) {  
                    compareTemp = sonArray[0];  
                    sonArray[0] = sonArray[compareIndex];  
                    sonArray[compareIndex] = compareTemp;  
                    compareIndex++;  
                }  
            }  
        }  
        //打印输出最大字符串  
        System.out.println("两个字符串的相同的最大子字符串为："+sonArray[0]);  
    }  
}