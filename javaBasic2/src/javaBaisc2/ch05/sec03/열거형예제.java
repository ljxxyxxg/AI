package javaBaisc2.ch05.sec03;

import java.util.Calendar;

public class 열거형예제 {

	public static void main(String[] args) {
		
		
		Week today = null; // today 라는 변수는 Week에 대한 변수
		
		//날짜와 관련된 객체
	    Calendar cal = Calendar.getInstance(); //날짜를 이용할 수 있다.
		
	    int week = cal.get(Calendar.DAY_OF_WEEK);
	    System.out.println( week );
	    
	    switch( week ) {
	    case 1 : today = Week.SUNDAY; break;
	    case 2 : today = Week.MONDAY; break;
	    case 3 : today = Week.TUESDAY; break;
	    case 4 : today = Week.TUESDAY; break;
	    case 5 : today = Week.THURSDAY; break;
	    case 6 : today = Week.FRIDAY; break;
	    case 7 : today = Week.SATURDAY; break;
	    
	    
	    }//열거형에서 열겨(잘못된 데이터 입력시)를 쓰지 않으면 에러가 발생
	
	    System.out.println(today); //열거형 Enum : 한정된 값만 같은 객체인 경우 장점 다른값이 들어오는 것을 막아줌
	    
	    //확인문제
	     
	    
	    
	}

}
