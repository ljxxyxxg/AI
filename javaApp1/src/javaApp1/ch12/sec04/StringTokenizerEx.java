
package javaApp1.ch12.sec04;

import java.util.StringTokenizer;

public class StringTokenizerEx { //보안부분 - 권한 , 인증 자바 언어 - 어휘 분석 짓는(단위) 단위

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍, 박연수"; //결과화면 홍길동 이수홍 박연수
		//방법1) String 클래스 split() 사용
		//방법2) StringTokenizer 클래스 사용
		
		//방법1
		String[] arr = data1.split("&|, ");
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		//향상된 for 문
		for(String i : arr) {
			System.out.println(i);
		}
		
		
		//방법2
		String data2 = "홍길동/이수홍/박연수/이순신/최수진";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	
		String data3 = "사과-배-귤-바나나";
		StringTokenizer sr = new StringTokenizer(data3, "-");
		while(sr.hasMoreTokens()) {
			System.out.println(sr.nextToken());
		}
		
		
		String data4 = "자바*+파이썬*+오라클*+텐서플로어";
		StringTokenizer sa = new StringTokenizer(data4, " *+ ");
		while(sa.hasMoreTokens()) {
			System.out.println(sa.nextToken());
		}
		

	}

}
