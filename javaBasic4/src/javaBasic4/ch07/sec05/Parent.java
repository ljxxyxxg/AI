package javaBasic4.ch07.sec05;

public class Parent {
	
	//필드
	public String nation;
	
	//기본생성자
	public Parent() {
		this("대한민국");// 자기 클래스에서 다른 생성자 호출
		System.out.println("Parent() call");
		
		
	}
	//생성자
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
		
	}

}
