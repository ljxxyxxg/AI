package javaBasic.ch04.sec01;

import java.util.Scanner;

public class switch문 {

	public static void main(String[] args) {
		
	
		//Scanner sc = new Scanner(System.in);
		//System.out.println("영어 첫글자 입력하기(A~C)");
		//String word = sc.next();
		//System.out.println( word );
		

		/*if( word.equals("A")) {System.out.println("Apple");}
		else if( word.equals("B")) {System.out.println("Bear");}
		else if( word.equals("C")) {System.out.println("Cat");}
		else {System.out.println("입력하신 글자는 A,B,C가 아닙니다.");};*/
		
		
		
		
		//switch( word ) { case "A": System.out.println("Apple"); break; case "B": System.out.println("Bear"); break; case"C": System.out.println("Cat"); break; default : System.out.println("입력하신 글자는 A,B,C가 아닙니다.");}
	
		//break문은 입력된 곳의 {} 밖으로 나가라
		//int number = 1;
		//switch( number ) { case 100: System.out.println("백의 자리"); break; case 10: System.out.println("십의 자리"); break; case 1 : System.out.println("일의 자리"); break;};
		
		int number = 1;
			if(number == 100) {System.out.println("백의자리");} else if(number == 10) {System.out.println("십의자리");} else if(number == 1) {System.out.println("일의자리");}
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
