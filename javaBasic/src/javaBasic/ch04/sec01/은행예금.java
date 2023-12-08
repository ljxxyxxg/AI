package javaBasic.ch04.sec01;

import java.util.Scanner;

public class 은행예금 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//★되게 중요!!!★
				Scanner sc = new Scanner(System.in);
				System.out.println("학생부");
				System.out.println("원하시는 선택지를 입력하세요.");
				String menu = sc.nextLine();
				
				/*int deposite = 0; //예금액
				int withdrawl = 0; //출금액
				int balance = 0; //잔금
				while( !menu.equals("4")  ) { System.out.println("----------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 |4. 종료"); 
				System.out.println("--------------------------"); 
				System.out.print("선택>");
				menu = sc.nextLine();
			
				switch( menu ) {
				case "1" : System.out.println("예금액>");
							deposite = sc.nextInt();
							sc.nextLine();
							balance = balance + deposite;
							break;
				case "2" : System.out.println("출금액>");
							withdrawl = sc.nextInt();
							sc.nextLine();
							balance = balance - withdrawl;
							break;
				case "3" : System.out.println("잔고>" + balance);
							break;
				case "4" : System.out.println("프로그램 종료");
					 		break;
				default : System.out.println("메뉴를 잘못 누르셨어요 다시");}
	
			 }*/
				Scanner sc = new Scanner(System.in);
				System.out.println("학생부");
				System.out.println("원하시는 선택지를 입력하세요.");
				String menu = sc.nextLine();
				
				
				
				
				
				
				
				String name = "홍길동";
				int score = 100;
						
				while( !menu.equals("4") ) {System.out.println("---------------------------");
				System.out.println("1.학생명 | 2.점수 | 3.출력 | 4.종료");
				System.out.println("---------------------------");
				System.out.println("선택>");
				menu = sc.nextLine();
				
				switch( menu ) {
				case "1" : System.out.println("홍길동");
							name = sc.nextLine();
							sc.nextLine();
							break;
				case "2" : System.out.println("100");
							score = sc.nextInt();
							sc.nextLine();
							break;
				case "3" : System.out.println( "홍길동" + score );
				            sc.nextLine();
							break;
				case "4" : System.out.println("종료");
							break;
				default : System.out.println("다시 선택하세요!");
				
							
				
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
