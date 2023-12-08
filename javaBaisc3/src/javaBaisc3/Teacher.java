package javaBaisc3;

public class Teacher {
	
	//멤버 필드, 필드
	String 이름;
	String 전공;
	int 급여;
	int 코드;
	String 구분;
	
	public Teacher(String 교사코드, String 성함, int 이, int 삼, String 구분2) {
		 this.이름 = 교사코드;
		 this.전공 = 성함;
		 this.급여 = 이;        //필드에 있는 급여 변수를 가르켜 주고 싶다. this 명령어 멤버 필드를 가르킨다  : 필드의 변수다
		 this.코드 = 삼;
		 this.구분 = 구분2;
		
		
		
	}



	public Teacher(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}



	public Teacher() {
		// TODO Auto-generated constructor stub
	}



	public String get이름() {
		return 이름;
	}


	public void set이름(String 이름) {
		this.이름 = 이름;
	}


	public String get전공() {
		return 전공;
	}


	public void set전공(String 전공) {
		this.전공 = 전공;
	}


	public int get급여() {
		return 급여;
	}


	public void set급여(int 급여) {
		this.급여 = 급여;
	}


	public int get코드() {
		return 코드;
	}


	public void set코드(int 코드) {
		this.코드 = 코드;
	}


	public String get구분() {
		return 구분;
	}


	public void set구분(String 구분) {
		this.구분 = 구분;
	}


	int[] score() {
		int score[] = new int[0];
		return score;
		
		
	};
	
	
	String[] report() {
		return null;
		
	};
	
	void 수업하기() {
		
		
		
	};
	
	void 휴강하기() {
		
		
	}



	public void set코드(String string) {
		// TODO Auto-generated method stub
		
	};
		
	
	

}
