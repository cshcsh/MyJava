package com.java5200.date0605;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date="2018-23-33";
		Pattern pattern=Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
		Matcher matcher=pattern.matcher(date);
		if(matcher.matches()){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
	}

}
