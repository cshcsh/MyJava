package com.java5200.date0604;


/**
 * ��ȡ�����ַ����������ͬ�Ӵ�
 * @author CSH
 * @date 2018��6��5������10:11:39
 */
public class StringMax2 {  
    
	public static void main(String[] args) {  
        sonStringOperation();  
    }  
    private static void sonStringOperation() {  
        String s2 = "asdfkljasdCCTVCCTVfioejsdfunbsdfhh";  
        String s = "asdfkasdiCCTVCCTVufasdfjh";  
        String temp; // ���������ַ�����ʹs.length()>s2.length  
        String s3;// ���ڴ洢��ȡ����ַ���  
        if (s.length() < s2.length()) {//�Ƚ�s��s2���ȣ����ϳ����ַ�������s  
            temp = s2;  
            s2 = s;  
            s = temp;  
        }  
        int count = s2.length();//���϶��ַ����ĳ��ȸ�ֵ��count  
        int sum = (count + 1) * count / 2;//����ó����п��ܽ�������ֵsum  
        String[] sonArray = new String[sum];//����sum���ռ��sonArray����  
        int arrIndex = 0;//sonArray�����±�  
        if (s.indexOf(s2) != -1) {//���s2Ϊs�����ַ���  
            System.out.println("������ַ���Ϊ" + s2);  
        } else if (s.indexOf(s2) == -1) {  
            for (int i = 0; i < s2.length(); i++) {  
                for (int j = s2.length(); j > i; j--) {  
                    s3 = s2.substring(i, j);//����ȡ����ַ�����ֵ��s3  
                    if (s.indexOf(s3) != -1) {  
                        //���s3Ϊs�����ַ�������s3����sonArray������  
                        sonArray[arrIndex] = s3;  
                        arrIndex++;  
                    }  
                }  
            }  
            if (sonArray[0] == null) {//���sonArray����Ϊ��  
                System.out.println("�����ַ���֮��û����ͬ�����ַ�����");  
                return;  
            }  
            String compareTemp = null;  
            //����sonArray���飬����󳤶ȵ��ַ�����ֵ��sonArray����ĵ�һ��ֵ  
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
        //��ӡ�������ַ���  
        System.out.println("�����ַ�������ͬ��������ַ���Ϊ��"+sonArray[0]);  
    }  
}