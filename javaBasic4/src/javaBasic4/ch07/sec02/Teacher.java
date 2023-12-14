package javaBasic4.ch07.sec02;

public class Teacher extends Student{
	
	
	String major;
	
	

	
	public void teach() {
		System.out.println("가르친다");
		
	} 
	
	public Teacher() {
		super("홍길동", 30, "컴퓨터 공학"); //부모생성자 호출 첫줄에만 써야한다
		System.out.println("자식 클래스 나 me");
	}
	 
	public Teacher(String name, int age, String dept, String major) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.major = major;
	}

}
