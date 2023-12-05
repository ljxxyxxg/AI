package javaBasic.ch03.sec02;

public class operator01 {

	public static void main(String[] args) {
		int number = 10;
		//number = number + 1; //엄청 많이쓰는 수식
		//number++;
		//++number;
		System.out.println( number );
		
		//number = number -1;
		//--number;
		//number--;
		System.out.println( number );
		
		int number1 = 100;
		number1++;
		System.out.println( number1 );
		
		int number2 = number1;
		System.out.println(number2);
		
		int number3 = 1000;
		number3++;
		int number4= number3;
		
		System.out.println(number3 );
		System.out.println(number4 );
		
		
		int number5 = 20;
		int number6 = number5++; // number5 = number6 먼저 대입 => 그후 number5 + 1
		
		System.out.println(number5 );
		System.out.println(number6 );
		
		int number7 = 200;
		int number8 = ++number7; // 1번) number7 = number7 + 1 => 2번 number8 = number7
		
		System.out.println( number8 );
		
		int number9 = 2000;
	    int number11 = 2000;
		
		
		System.out.println( number9 );
		System.out.println( (number9++) + number11 );
		System.out.println( number9 );
		
		int number10 = 2000;
		
		
		System.out.println( ++number10 );
		System.out.println( number10 );
		
	}

}
