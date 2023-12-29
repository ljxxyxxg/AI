package javaApp5.ch17.sec01;

import java.util.*;
import java.util.stream.*;

public class StreamEx01 {

	public static void main(String[] args) {
		// 스트림 - 흐르다
		// 스트림 순서 : 1단계 컬렉션 또는 배열 --> 2단계 오리지널 스트림 --> 3단계 중간단계(필터, 매핑등) - 생략가능 --> 4단계 최종스트림
		
//		//1단계
//		List<Student> list = Arrays.asList(new Student("홍길동", 10),
//					  					   new Student("신용권", 20),
//					  					   new Student("유미선", 30));
//		
//		//2단계 오리지널 스트림 생성
//		Stream<Student> studentStream = list.stream();
//		
//		
//		//3단계 점수를 가지고 오기 중간단계(필터, 매핑등)
//		IntStream scoreStream = studentStream.mapToInt( student -> student.getScore() );
//		
//		
//		//4단계 점수의 평균을 구하기 (최종스트림)
//		double avg = scoreStream.average().getAsDouble();
//		
//		System.out.println( avg );
		
		
		//방법2) 1단계
		List<Student> list = Arrays.asList(new Student("홍길동", 10),
									       new Student("신용권", 20),
									       new Student("유미선", 30));
		
		//2단계
		double avg =
					list.stream()
						//3단계
						.mapToInt( student -> student.getScore() )
						//4단계
						.average()
						.getAsDouble();
		System.out.println( avg );
						
			
			
			
			
			
			
		
	}

}

class Student {
	
	private String name;
	private int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}


	
	
}