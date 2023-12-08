package javaBaisc3.ch06.sec07;

public class 확인문제6장16번 {

	public static void main(String[] args) {
		
		
		Printer printer = new Printer(); //Printer 객체 생성한다.
		
		
		printer.println(10); //참조변수명.메소드
		printer.println(true);
		printer.println(5,7);
		printer.println("홍길동");
		
		Printer.println(10); //클래스명.메소드 static 메소드
		Printer.println(true);
		Printer.println(5,7);
		Printer.println("홍길동");
		
		
		
	}

}
