package javaBasic4.ch07.sec07;



// 클래스에 final이 붙으면 부모가 될 수 없다. ~ 이 클래스가 끝이면 자식이 없어 
// 메소드에 final이 붙으면 재정의를 할 수 없다. ~ 내용이 끝이야
// 필드에 final 붙으면 값이 마지막 값이 된다
//예) 상수처림 final static int max

//부모 클래스
public class Person {

	String name;
	int age;
	final static int MAX = 100;
	
	public final void eat() {
		System.out.println("일반 밥을 먹는다.");
		//max = max - 50; 
	}
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
}
