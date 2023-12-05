
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int count = 100;
		
		count += 10; //count = count + 10;
		
		count -= 20; //count = count - 20;
		
		count *= 5;
		
		count /= 10;
		
		count %= 5;
		
		boolean b1 = true;
		
		b1 &= false;
		b1 |= true;
		
		//삼항 연산자 = 조건 연산자
		//형식 조건식? 참이면 : 거짓이면

		int score = 95;
		//90점이상이면 장학생 아니면 비장학생 출력하기

		String result = (score >= 90) ? "장학생" : "비장학생";
		//                            만약 점수가 90점이 참이면 결과 장학생 거짓이면 비장학생
		
		System.out.println( result );
		
	   
		
		        double avg = 90.34;
		        
	    
	    		int sum = 1000 + 500 + 30;
	    		
	    	    System.out.println();
	    		
	    		
	    	    System.out.println((avg > 85.8 && sum >= 1400) ? "통과" : "실패");
	    	    
	    	    String name = "이수연";
	    	    result =(name=="김수연" || name== "이수연" || name== "최수연") ? "친구야! 안녕" : "안녕하세요";
	    	    System.out.println( result );
	    	   
		
		
		
		
		
		

	}

}
