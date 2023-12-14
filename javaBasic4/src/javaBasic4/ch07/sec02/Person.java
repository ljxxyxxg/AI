package javaBasic4.ch07.sec02;

//부모클래스 = 슈퍼클래스 = 상위 클래스
public class Person {

	String name;
	int age;
	
	
	public void eat () {
		System.out.println("먹는다");
		
	}
	
	
	public void sleep() {
		System.out.println("잔다");
		
	}
	
	public Person() {
		System.out.println("조상 할머니 부모 클래스 입니다.");
		
	}
	
	

}
