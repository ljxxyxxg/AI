package javaBasic.ch03.sec02;

import java.util.Scanner;

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);//키보드로 글자 입력하는 클래스
//		
//		
//		
//		
//		
//		
//		double math = sc.nextDouble();
//		
//		System.out.println( math );
//		
//		
//		boolean  man = sc.nextBoolean();
//		System.out.println( man );
//		
//		
//		String name = sc.next();
//		System.out.println( name );
	
		
		System.out.println("이름은?");
		String name = sc.next();
		System.out.println();//줄바꿈
		
		
		System.out.println("국어점수는?");
		int kor = sc.nextInt();
		System.out.println();
		
		System.out.println("영어점수는?");
		int eng = sc.nextInt();
		System.out.println();
		
		
		System.out.println("수학점수는?");
		int mat = sc.nextInt();
		System.out.println();
		
		System.out.println(name + "  " + kor +"  " + eng + "  " + mat);
		
		int sum = kor + eng + mat;
		
		int sum1 = sum - kor;
		
		double ave = sum / 3.0;
		
		//2의 배수면 짝수
		//% 나머지를 구함
		int matMod = mat % 2;
		
		System.out.println( sum + " " + sum1 +  " " + ave + " " + matMod);
		
		
		
		
	}

}
