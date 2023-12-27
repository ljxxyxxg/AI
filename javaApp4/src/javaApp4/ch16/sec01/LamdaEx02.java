package javaApp4.ch16.sec01;

public class LamdaEx02 {

	public static void main(String[] args) {
		//"서울" ----> 서울대학교 "인천" ----->인천대학교

		//방법 1 : colleage<String> s1 = (name) -> { return name + "대학교"; };
		//방법 2 : colleage<String> s1 = (name) -> name + "대학교";
		colleage<String> s1 = name -> name + "대학교"; //매개변수 값이 1개이면 ()는 생략
		System.out.println(s1.cName("서울"));
		System.out.println(s1.cName("인천"));
	
		//사과 사세요. 배 사세요
		Fruit<String> s2 = name -> name + "사세요";
		System.out.println(s2.fName("사과"));
		System.out.println(s2.fName("배"));
		
		//3000원 이상이면 비싸요. 미만이면 싸요
		Money<Integer> s3 = name -> {
		 if(name >= 2000) return name + 10000;
		 else return name - 5000;
		};
	
		System.out.println(s3.mName(2000));
		System.out.println(s3.mName(5000));
	}

}

@FunctionalInterface
interface colleage<T> {
	T cName( T name );
	
}

@FunctionalInterface
interface Fruit<T> {
	T fName( T name);
}

@FunctionalInterface
interface Money<T> {
	T mName(T name);
}