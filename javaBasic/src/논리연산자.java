
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println( b1 && b2 ); // && 그리고
		System.out.println( b1|| b2); // ||또는
		System.out.println( b1 ^ b2 ); // 참 거짓이면 참
		System.out.println( !b1 ); //부정 반대
		
		
		//비트 연산자
		byte b3 = 10;
		byte b4 = 7;
		
		System.out.println( b1 & b2 ); // & 그리고 0 거짓 1 참
		System.out.println( b1 | b2); // | 또는 둘중 한개가 1이면 1
		
		
		
		
		

	}

}
