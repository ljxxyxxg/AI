package javaApp5.ch18.sec02;

import java.util.*;

public class StreamEx02 {

	public static void main(String[] args) {
		// 목표 : 중간 스트림 처리하는 방법 익히기
		// 스트림 처리 순서 : 컬렉션 또는 배열 --> 오리지널 스트림 --> 중간단계(필터, 매핑등) - 생략가능 --> 최종 스트림
		
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("귤");
		list.add("딸기");
		list.add("딸기");			
		
				
		list.stream()
			.filter(t -> t.equals("딸기") ) 
			.forEach(p -> System.out.println(p));
		
		//중복제거하기
		
		list.stream()
			.filter(t -> t.equals("딸기") ) 
			.distinct()
			.forEach(p -> System.out.println(p + " 야이야  "));	 
			
		//매핑 : 다른 것으로 바꾸어 주기
		//컬렉션
		List<Student> stList = new ArrayList<Student>();
		stList.add(new Student("홍길동", 85, "010-125-1234", 3.6));
		stList.add(new Student("홍길동2", 90, "010-789-1234", 3.6));
		stList.add(new Student("홍길동3", 89, "010-456-1234", 3.6));
		stList.add(new Student("홍길동4", 96, "010-254-1234", 3.6));
		
		//스트림 만들기
		stList.stream()
			  .mapToInt(s -> s.getScore())
			  .forEach( p -> System.out.println( p ));
		
		
		stList.stream()
		  .map(t -> t.getPhone())
		  .forEach( p -> System.out.println( p ));
	
		stList.stream()
		  .map(t -> t.getName())
		  .forEach( p -> System.out.println( p ));
	
		stList.stream()
		  .mapToDouble(t -> t.getSight())
		  .forEach( p -> System.out.println( p ));
		
		
		
			
	}

}

class Student {
	
	private String name;
	private int score;
	private String phone;
	private double sight;
	
	

	

	public Student(String name, int score, String phone,double sight) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
		this.sight = sight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public double getSight() {
		return sight;
	}

	public void setSight(double sight) {
		this.sight = sight;
	}
	
	
}