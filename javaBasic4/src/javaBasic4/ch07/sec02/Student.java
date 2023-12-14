package javaBasic4.ch07.sec02;


//자식 클래스 = 하위 클래스
public class Student extends Person{
	
	
	String dept;//전공
	
	public void study() {
		System.out.println("공부한다.");
	}

	
	public Student() {
		//super(); //부모생성자 호출
		System.out.println("부모클래스 아버지 클래스 내용이 있는 생성자 " + name);
	}

	public Student(String 이름, int 나이, String 전공) {
		this.name = 이름;
		this.age = 나이;
		this.dept = 전공;
		
		
		
		
	}
	
	
}
