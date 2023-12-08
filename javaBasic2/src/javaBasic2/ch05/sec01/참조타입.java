package javaBasic2.ch05.sec01;

import java.util.Scanner;

public class 참조타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;// 스택공간
		
		Scanner sc = new Scanner(System.in); //new 힙메모리에 Scanner클래스를 올려주세요.
		//sc=Scanner라는 주소의 변수 타입	
  	
		//힙메모리에 주소를 스택공간의 변수에 저장해야한다.
	
		System.out.println( n );
		
		//변수 형식 자료형 변수명;
		Student st  = new Student();
		//Class에 코드를 작성 - 설계도 ----> 사용하려면 메모리에 올려 놓고(new) 자료 사용하기
		//new명령어 사용시 힙메모리에 올라감 --> 힙메모리에 올라가면 주소 생성 ---> 스택공간에다 참조 변수(주소가 들어있는 변수)를 선언하고 넣어 주어야 한다.
		
		// Teacher 클래스를 사용하려면 힙메모리에 올려주어야한다
		Teacher th = new Teacher();
		//Teacher 라는 클래스의 th는 주소
		
		
		//Person 클래스를 만들고 힙메모리에 올려주세요.주소를 per 변수에 넣어주세요.
		Person per = new Person();
		//Person 이라는 클래스의 per는 주소
	
		//Guide 클래스를 만들고 힙메모리에 올리기
		Guide gud = new Guide();
		
		//Stuck 클래스를 만들고 힙메모리에 올리기
		Stuck su = new Stuck();
	
	
	
	
	
	
	
	
	
	
	
	}

}
