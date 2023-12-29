package javaApp5.ch17.sec06;

import java.util.Arrays;

public class StreamEx06 {

	public static void main(String[] args) {
		// 루핑 : 반복해서 한개씩 가져와서 처리하기
		// 매칭 : 조건에 만족하는지 여부를 조사하는 최종처리기능

		
		int[] intArr = {2, 4, 6, 7};
		
		
		boolean result =
				
					Arrays.stream( intArr )
						  .allMatch( i -> i % 2 == 0); // 모든 스트림이 참이면 참
		System.out.println( result );
			  
		result =
				
				Arrays.stream( intArr )
					  .anyMatch( i -> i % 2 == 0); // 모든 스트림에서 한개만 참이연 참
	System.out.println( result );
		  
		
		result =
				
				Arrays.stream( intArr )
					  .noneMatch( i -> i % 2 == 0); // 모든 스트림에서 거짓이면 참
	System.out.println( result );
	
	
	
	int[] intArr2 = {};
	
	long count =
			
		Arrays.stream(intArr2)
			.filter( n -> n % 2 == 0)
			.count();
		
		System.out.println("짝수의 갯수는?" + count);
		
		//홀수의 총합을 구하기
		
	int oddSum =	
		Arrays.stream(intArr2)
				.filter(n -> n % 2 != 0)
				.sum();
		System.out.println("홀수의 합은?" + oddSum); //reduce() - 기본 합계, 평균, 최대, 최소, 갯수 함수를 제외하고 다른식의 계산이 필요한 경우 이용한다
													//예) 분산 , 표준편차, 확률 등
												  //collect -최종결과를 리스트로 만들어 주고 싶다. 배열로 만들어 주고 싶다.
	
	}

}


