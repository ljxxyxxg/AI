import java.util.Scanner;

public class 복습문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1단계 입력을 받는다. 키보드로 입력할 수 있는 클래스 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("---화씨를 섭씨로, 섭씨를 화씨로 바꾸기---");
		System.out.println(" 문자를 입력하세요?(C,F)");
		String word = sc.next();
		System.out.println("바꾸려는 온도를 입력하세요.");
		int temp = sc.nextInt();
		
		//2단계 문자가 "C"인지 "F"인지를 판단하기 : 문자인 경우 equals 사용
		double result = 0.0;
		if( word.equals("C") || word.equals("c") ) { result  = (9.0 / 5.0) * (temp + 32);} else if( word.equals("F") || word.equals("f")) { result = (5.0/9.0) * (temp - 32);}
		
		
		//3단계 결과 출력하기
		System.out.println( "정답은" + result );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
