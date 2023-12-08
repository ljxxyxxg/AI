package javaBasic2.ch05.sec02;

public class 배열연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 배열 : 동일한 자료들의 집합, 연속해서 저장되어 있다.
		// 배열 쓰는 이유 : 정수 100개를 기억해야 한다면 변수 100개를 만들어야함 배열로 선언한다.
		// 배열 만드는 방법? 1차원 2차원 3차원
		 int[] arr = new int[] {1,2,3,4,5};
		 String[] sArr   = new String[] {"a","b"};
		 double[] dArr = new double[] {1.1, 2.2, 3.3}; 
		 boolean[] bArr = new boolean[] {true, false};
		
		  byte[] by = new byte[] {1,2,3};
		  short[] sr = new short[] {6,7};
		 float[] fl = new float[] {1.1f,2.2f};
		
		 
		 
		 //arr배열의 [0]의 값 1을 출력하려면
		 System.out.println(arr[0]);
		 //"b"를 출력하기
		 System.out.println(sArr[1]);
		 //3.3 출력
		 System.out.println(dArr[2]);
		 
		 //arr 배열의 [0]의 값 1을 10으로 변경
		 arr[0] = 10;
		 
		 //방법2) 빈 배열을 만들고 나중에 값 넣기
		 int[] intArr = new int[3];
		 double[] doubleArr2 = new double[5];
		 
		 intArr[0] = 3;
		 intArr[1] = 5;
		 intArr[2] = 7;
		 
		 //문자열 4개를 넣는 빈 배열 만들기
		 //내용은 "a","b","c","d",로 넣어주기
		 String[] sg = new String[4];
		 
		 sg[0] = "a";
		 sg[1] = "b";
		 sg[2] = "c";
		 sg[3] = "d";
		
		 
		 int[] intArr3 = new int[100];
		 for( int i=0; i<100; i++) {intArr3[i] = i+1;}
		 for(int i=0; i<100; i++) {System.out.println(intArr3[i]);}
		 
		 int[] intArr10 = null; //null문자 주소가 안들어 갔다 미지정
		 
		/* //p.166
		 int[] score = new int[] {100, 90, 87, 90, 100};
		 //int sum = 0;
		 for(int i = 0; i<5; i++ ) { sum += score[i];};
		 int avg = sum/5;
		 System.out.println("합계는 " + sum);
		 System.out.println("평균은 " + avg);
		 
		 //배열의 길이 배열명.length
		 System.out.println(score.length);
		 

		 //score[5]=60;
		 //score[6]=90;*/
		 
		
		
		
		
		
		
		String[] season = { "Spring", "Summer" , "Fall" , "Winter"};
		
		System.out.println("season[0] :  " + season[0]);
		System.out.println("season[1] :  " + season[1]);
		System.out.println("season[2] :  " + season[2]);
		System.out.println("season[3] :  " + season[3]);
		
	
		season[1] = "여름";
		System.out.println("season[1] :  " + season[1]);
		System.out.println();
		
		//int[] scores = new int[] { 83, 90, 87};
		//int[] scores = { 83, 90, 87}; //위의 형식과 동일 new int[] 생략
		
		
		int sum = 0;
		//for(int i=0; i<3; i++) {sum += scores[i]; }
		
		 System.out.println("합계는 " + sum);
		 double evg = (double) sum / 3;
		 System.out.println("평균은 " + evg);
		
		 String[] names = new String[30];
		 
		 //힙메모리 공간안에 자료형은 기본형으로 자동 셋팅됨
		 // 스택메모리 공간의 초기값은 자동으로 안됨. 개발자가 초기값 넣어주어야함
		
		 String[] names2 = {"홍길동", "김수지" ,"이경주"};
		 int[] scores2 = {100, 95, 85};
		 
		 for( int i=0; i< names2.length ; i++) {System.out.println(names2[i]+"" + scores2[i]);}
		 
		 
		String[] names3 = {"차량명" , "차량 총액" , "인도금" ,"할부원금" , "상환기간9(월)" , "월납입금"	}
		String[] names4 = {"싼타페" , "코란도"}
		
		int[] scores3 = {35000000, 15000000,
		
		
		
		
	}

}
