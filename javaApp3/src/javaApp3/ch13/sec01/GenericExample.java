package javaApp3.ch13.sec01;

public class GenericExample {
	//제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2 ) {
		//T의 타입 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + "," +t2.getClass().getSimpleName() + ")");
		//Number의 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return (v1 == v2);
		
		
		
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출
		boolean result1 = compare(10,20);
		System.out.println(result1);
		System.out.println();
		
		
		//제네릭 메소드 호출
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		System.out.println();
		
		boolean result3 = compare(4.5f, 4.5f);//float형 4.5f
		System.out.println(result3);
		System.out.println();
		
		boolean result4 = compare(500L, 100L);//long형 정수형 8바이트
		System.out.println(result4);
		System.out.println();
		
//		boolean result5 = compare("a", "b"); //타입에러 Number의 자식만 가능(문자형은 Number객체가 아니라서 에러)
//		System.out.println(result5);
//		System.out.println();
	}
		
		
}

