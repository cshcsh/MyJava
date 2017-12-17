package com.java5200.date0611;

public class ExceptionTest {

	public static int doStuff(int _p) throws Exception {
		//try {
			if (_p < 0) {
				throw new Exception("数据格式错误");
			} else {
				return _p;
			}
		/*} catch (Exception e) {
			throw e;
		} finally {
			return -1;
		}*/
	}

	

	public static void main(String[] args) {

		try {
			doStuff(-100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("程序运行到这里结束");
		}
	}

}
