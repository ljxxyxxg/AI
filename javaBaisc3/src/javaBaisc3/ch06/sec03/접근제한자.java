package javaBaisc3.ch06.sec03;

import javaBaisc3.ch06.sec04.AA;

public class 접근제한자 {

	public static void main(String[] args) {
		
		A aAdd = new A(); //객체화 하기
		
		//System.out.println(aAdd.a); private 다른 객체에서 못씀
		
		System.out.println(aAdd.b); //default 같은 패키지 가능
		
		System.out.println(aAdd.c); //public 가능
		
		
		//aAdd.a1(); private 다른객체에서 못씀
		aAdd.b1();
		aAdd.c1();

		
		AA aaAdd = new AA();
		// 에러System.out.println( aaAdd.a ); private 다른객체에서 못씀
		// System.out.println( aaAdd.b); default  같은 패키지만 가능
		System.out.println(aaAdd.c); //접근제한자가 public이니깐 가능하다
		
		
		/*aaAdd.a1();
		aaAdd.b1();*/
		
		aaAdd.c1();
		
		//실제 개발시 변수는 private 메소드 public으로 선언
		
		
		
	}

}
