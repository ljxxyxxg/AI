package javaBasic.ch04.sec01;

public class If문 {

	public static void main(String[] args) {
		// 만약에 조건이 참이면 거짓
		int score = 87;
		if(score >= 90) {System.out.println( "A");}; 
		if( 80 <= score && score <= 89) {System.out.println( "B");};
		if( 70 <= score && score <= 79) {System.out.println( "C");};
		
		//a>= 10 이고 b <= 20 이거나 c==20 이면 합격입니다
		int a=20, b=10, c=20;
		if(a>=10 && b <=20 || c==20) { System.out.println("합격");}
		
		//d ! = 0이고 e가 NaN이고 f가 거짓이면 "잘못된 코드입니다" 아니면 "훌륭한 코드입니다"
		int d = 10;
		double e = 10 / 0.0;
		boolean f = false;
		System.out.println( e );
		if(d != 0 && Double.isNaN(e) && !f ) {System.out.println("잘못된 코드입니다.");} else {System.out.println("훌륭한 코드입니다.");}
		
		
		//변수 ok 참이면 합격 아니면 불합격
		boolean ok = true;
		if( ok ) {System.out.println();} else {System.out.println();}
		
		
		
		int number = 1;
		if( number == 1 ) {System.out.println("일");} else if( number == 2) {System.out.println("이");} else if(number == 3){System.out.println("삼");} else if(number == 4) {System.out.println("사");};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
