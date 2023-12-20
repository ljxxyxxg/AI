package javaApp1.ch12.sec04;

import java.util.TimeZone;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;

public class LosaAngelsEx { //���ó�¥ ��� Date now = new Date(); Calendar.getInstance(); -- �� �˾� �μ��� LocalDateTime now1 = LocalDateTime.now();

	public static void main(String[] args) {
	TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
	TimeZone timeZone1 = TimeZone.getTimeZone("JST");
	TimeZone timeZone2 = TimeZone.getTimeZone("Asia/Seoul");
	
	Calendar now = Calendar.getInstance(timeZone1);
	System.out.println( now.get(Calendar.MONTH) + "��" + now.get(Calendar.DAY_OF_MONTH)+"��");
	System.out.println( now.get(Calendar.HOUR) + "��" + now.get(Calendar.MINUTE)+"��");
	
	//Ÿ���� �˻� "java timezone ids list"
	//https://garygreygort.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/
	
	
	String[] av = TimeZone.getAvailableIDs();
	for (String a : av) {
		System.out.println( a );
		
	}
	
	LocalDateTime now1 = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.mm.dd a HH:mm:ss");	
	System.out.println( "����ð�: " + now1.format(dtf));
	
	//1����
	LocalDateTime now1After = now1.plusYears(1);
	System.out.println("1���� : " + now1After.format(dtf));
	
	//3����
	LocalDateTime now3Before = now1.minusYears(3);
	System.out.println("3����: " + now3Before.format(dtf));
	
	//�ٴ�����
	
	LocalDateTime now2weekAfter = now1.plusWeeks(2);
	System.out.println( "����: " + now1.format(dtf));
	System.out.println( "�ݳ�: " + now2weekAfter.format(dtf));
	
	
	
	
	
	}

}
