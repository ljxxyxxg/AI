package javaApp1.ch12.sec04;

import java.util.TimeZone;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;

public class LosaAngelsEx { //오늘날짜 얻기 Date now = new Date(); Calendar.getInstance(); -- 잘 알아 두세요 LocalDateTime now1 = LocalDateTime.now();

	public static void main(String[] args) {
	TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
	TimeZone timeZone1 = TimeZone.getTimeZone("JST");
	TimeZone timeZone2 = TimeZone.getTimeZone("Asia/Seoul");
	
	Calendar now = Calendar.getInstance(timeZone1);
	System.out.println( now.get(Calendar.MONTH) + "월" + now.get(Calendar.DAY_OF_MONTH)+"일");
	System.out.println( now.get(Calendar.HOUR) + "시" + now.get(Calendar.MINUTE)+"분");
	
	//타임존 검색 "java timezone ids list"
	//https://garygreygort.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/
	
	
	String[] av = TimeZone.getAvailableIDs();
	for (String a : av) {
		System.out.println( a );
		
	}
	
	LocalDateTime now1 = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.mm.dd a HH:mm:ss");	
	System.out.println( "현재시간: " + now1.format(dtf));
	
	//1년후
	LocalDateTime now1After = now1.plusYears(1);
	System.out.println("1년후 : " + now1After.format(dtf));
	
	//3년전
	LocalDateTime now3Before = now1.minusYears(3);
	System.out.println("3년전: " + now3Before.format(dtf));
	
	//다다음주
	
	LocalDateTime now2weekAfter = now1.plusWeeks(2);
	System.out.println( "대출: " + now1.format(dtf));
	System.out.println( "반납: " + now2weekAfter.format(dtf));
	
	
	
	
	
	}

}
