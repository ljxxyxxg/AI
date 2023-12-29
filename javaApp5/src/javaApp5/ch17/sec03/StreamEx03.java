package javaApp5.ch17.sec03;


import java.util.*;

public class StreamEx03 {

	public static void main(String[] args) {
		// 중간 스트림 익히기
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am Ironman");
		
		
//		String a= "this is java";
//		String[] as = a.split(" ");
//		for( String s : as) {
//			System.out.println( s );
//		}
		//요구사항
		//문장을 넣어서 " " 으로 된 부분을 잘라서 단어 출력
		list1.stream()
			 .flatMap(t -> Arrays.stream(t.split(" ")))
			 .forEach(p -> System.out.println( p ));
		
		
		List<String> list2 = Arrays.asList("10,20,30", "40, 50");
		
		int result = 	
				list2.stream()	
					 .flatMapToInt( t -> {
		    	 							String[] ss = t.split(",");
		    	 							int[] intArr = new int[ss.length];
		    	 							for( int i = 0; i<ss.length; i++) {
		    	 								intArr[i] =  Integer.parseInt(ss[i].trim());
		    	 						}
		    	 						return Arrays.stream(intArr);		
		    	       })
		     .sum();		
		System.out.println( result );
		
		
		List<String> list3 = Arrays.asList("10.6,20.4,30.5", "40.6, 50.5");
	
				double result3 = 	
					list3.stream()	
						 .flatMapToDouble( t -> {
			    	 							String[] ss = t.split(",");
			    	 							double[] intArr = new double[ss.length];
			    	 							for( int i = 0; i<ss.length; i++) {
			    	 								intArr[i] =  Double.parseDouble(ss[i].trim());
			    	 						}
			    	 						return Arrays.stream(intArr);	
			    	       })
			     .sum();		
			System.out.println( result3 );
		

	}

}
