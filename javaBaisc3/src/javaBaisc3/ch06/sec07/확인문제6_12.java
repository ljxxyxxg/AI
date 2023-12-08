package javaBaisc3.ch06.sec07;

import java.util.Scanner;

public class 확인문제6_12 {
	public static void main( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name 
		String password 
		
		
		System.out.print("id>");
		String id = sc.next();
		System.out.print("password>") ;
		String password = sc.next();
		
			
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login(id, password);
		
		
		if( result ) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("Hong");
			
			
			
		}
		
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		};
		
	}

}
