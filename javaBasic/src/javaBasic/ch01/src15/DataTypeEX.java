package javaBasic.ch01.src15;

public class DataTypeEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
	   // 자료형 - 기본형, 참조형
		
		
	   byte b1 = 30;
	   System.out.println( b1 );
	   
	   byte b2 = 10;
	   byte b3 = 20;
	   
	   int b23 = b2 + b3; // + 더하기 연산자는 int형으로 처리함  byte 형 int 형 byte 형
	   System.out.println( b23 );
	   
	   byte b4 = 20;
	   short s4= 30;
	   
	   int sumb4s4 = b4 + s4;
	   System.out.println( sumb4s4 );
	   
	   float f1 = 3.14f;
	   float f2 = 3.12345678f; // 소수점 7자리까지 출력
	   
	   System.out.println(f1 + "   " + f2);
	   
	   double d1 = 3.123456789012345; // 15자리 까지 찍는다
	   System.out.println( d1 );
	   
	   //실수형은 float : 4 byte 와 double : 8 byte
	     //float는 뒤에 f 
	     //double형이 실수의 기본형
	   
	   float f3=10.23f;
	   float f4=2.45f;
	   float mulf3f4 = f3 * f4;
	   System.out.println( mulf3f4 );
	   
	   double resulf3f4d = f3 / f4; // float 자료형이 double 형으로 변환 (cast 연산: 자동형변환)
			
       int ii1 = 10;
       short ss1 = 20;
       
       float ff1 = ii1; // 실수형 = 정수형
     
    
       //실수형 --> 정수형 30평 아파트 ---> 8평 원룸 가구를 버린다. 데이터 손실
       //형식 정수형타입 변수명 =(정수형 타입) 실수형 변수
       
       double d10 = 3.14;
       int change10 = (int) d10; //소수점 .14를 손실한다
       System.out.println(d10 + "  " + change10);

       
       //형변환 = 강제 형변화 = down cast 연사 큰타입 -> 작은타입으로 바뀜
       //형식 정수형 타입 변수명 =(정수형 타입) 실수형 변수
       float f10 = 10.25f;
       byte changef10 = (byte) f10;
       
       int i10 = 3000;
       short chi10 = (short) i10;
       
       
       //문 정수형으로 국어 점수 수학 점수 영어점수 변수 담으세요.
       int kor = 80;
       int mat = 90;
       int eng = 93;
       
       
       //합계 구하기
       int sum1 = kor + mat + eng;
       
       //출력하기
       System.out.println("합계는" + (sum1 / 3.0));
       // 정수 / 정수 하면 정수만 나온다.
       //평균을 구하세요
       double ave = sum1 / 3.0;
       double avg1 = (double)sum1 / 3;
       //평균
      System.out.println("평균은" + ave );      
      System.out.println("평균은" + avg1 );
     
      
      
      //수학 점수의 거듭제곱 80^2
      int matdouble = mat*mat;
      System.out.println("90 거듭제곱" + mat*mat); 
      
      
      
      
      char ch1 = 'a';
      System.out.println((int) ch1);
      
      System.out.println( (char)ch1 + 3);
     // %c"는 문자형으로 ch1 + 3이 100 유니코드 숫자를 문자형으로 출력하기

     //Korea를 출력하기
      System.out.printf("%c%c%c%c%c", 75, 111, 114, 101, 97 );
       
      
	}

}
