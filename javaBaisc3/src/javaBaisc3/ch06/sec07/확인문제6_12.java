package javaBaisc3.ch06.sec07;

import java.util.Scanner;

public class Ȯ�ι���6_12 {
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
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("Hong");
			
			
			
		}
		
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		};
		
	}

}
