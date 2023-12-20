package javaApp1.ch12.sec04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd. HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println( strNow2 );
		
		
		
		
		
	}

}
