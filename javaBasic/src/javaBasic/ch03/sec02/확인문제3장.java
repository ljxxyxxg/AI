package javaBasic.ch03.sec02;

public class 확인문제3장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=10;
		int y=20;
		int z = (++x) + (y--);
		System.out.println( z );
		
		int score = 85;
		String result = ( !(score>90) ) ? "가" : "나";
		System.out.println( result );
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		
		System.out.println(pencilsPerStudent);
			
		int pencilsLeft = pencils % students;
		System.out.println( pencilsLeft );
		
		int val = 356;
		System.out.println(val/100*100);
		
		
		int lengthTop = 5;
		int lengthBot = 10;
		int height =7;
		double area = ((double)(lengthTop + lengthBot)*height / 2.0);
				System.out.println( area );
		
		
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = 5 % y2;
		if( Double.isNaN(z2)) {System.out.println( "0.0으로 나눌 수 없습니다.");} else { double result2 = z + 10; System.out.println("결과: " + result2);};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
