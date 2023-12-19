package javaApp1;

import java.lang.module.ModuleDescriptor;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = "abcde";
		int aHashCode =	a.hashCode();
		System.out.println( aHashCode );
		double pi = Math.PI;
		System.out.println( pi );
		double e = Math.E;		
		System.out.println( e );
		double cos45  = Math.cos(45.0);
		System.out.println(cos45);
		
		Date date = new Date();
		int date1 = date.getDate();
		System.out.println(date1);
		
		long time1 = date.getTime();
		System.out.println(time1);
			
			
		long date2 = Date.parse("2023/12/19");	
		System.out.println(date2);
		//DateFormat.parse("2023/12/19");
		
		String text = "ab/cd/df";
		StringTokenizer st = new StringTokenizer("ab/cd/df", "/");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		int count = st.countTokens();
		System.out.println(count); // 3
		String token1 = st.nextToken();
		System.out.println( token1 );
		token1 = st.nextToken();
		System.out.println( token1 );
		token1 = st.nextToken();
		System.out.println( token1 );
		

		
		
		
	}

}

