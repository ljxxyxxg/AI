package javaBaisc2.ch05.sec03;

import java.util.Scanner;

public class 문자열추출 {

	public static void main(String[] args) {
	
		String title = "자바프래로그래밍"; //문자열 객체
		String title2 = new String("자바프로그래밍");
		
		System.out.println(title2.length() ); //length : 문자열의 길이를 구하는것
		System.out.println(title2.charAt(1) );//charAt(인덱스번호)
		System.out.println(title2.charAt(6) );
		
		title2 = title2.replace("자바","java");
		System.out.println(title2);
		
		title2 = title2.substring(4, 8);
		System.out.println(title2);
		
		System.out.println(title.subSequence(0, 2) );//자바 출력
		System.out.println(title.indexOf("밍") );//"밍" 인덱스 번호 알기
		System.out.println(title.indexOf("래", 4) );//인덱스 4번뒤로 "래"를 찾아라
		
		
		String names = "이순신,홍길동,전우치";
		String[] nameArr = names.split(",");
		
		for(int i=0; i< nameArr.length; i++) {
			System.out.println(nameArr[i] );
			
		}
		
		
		String fruits = "사과-배-귤-바나나";
		String[] fruit = fruits.split("-");
		
		for(int i=0; i< fruit.length; i++) {
			System.out.println(fruit[i] );
			
		}
		
		//향상된 for문
		//형식 for( 타입변수 : | 집합) { 반복할 내용 }
		for(String f : fruit) {
			System.out.println( f );
		}
		
		//과일중에서 수박이 있나요? 없어요
		
		Scanner sc = new Scanner(System.in); 
			System.out.println( "무슨 과일 사실래요? ");
			String order = sc.nextLine();
			boolean flag = false; // 과일이 있는지 없는지 체크 하는 변수
			for(String f : fruit) {
				if(order.equals(f) ) {
					System.out.println("있습니다.");
					flag = true;
					break;
				}
				
			}
		if( !flag) System.out.println("없습니다.");
		
		int[] array;
		//array = {1, 2, 3}; 에러발생
		array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		
		
		
	}

}
