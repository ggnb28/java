package chap_06_01;

public class NewCal {
	// 10+20; 10, 20 피연산자, + 연산자
	// access modifier : 접근 수정자, 접근 식별자
	// public(누구나), 
	// protected(같은 패키지에 있지않아도 상속 관계에 있으면 사용),
	// 기본(아무것도 쓰지 않음, 같은 패키지에 있는 클래스들만 사용하게 해줄래),
	// private (나혼자사용할때)
	
	private int operand1;
	private int operand2;
	private String operator;
	
	// constructor : 객체 초기화
	// this : 
	public NewCal() {// 기본(default) 생성자
		this.operand1 = 10;
		this.operator = "+";
		this.operand2 = 20;
	}
	public NewCal(int o1, String op, int o2) {
		this.operand1 = o1;
		this.operator = op;
		this.operand2 = o2;
	}
	
	// custom method
	// int : 반환유형, 리턴타입 - 메소드 처리후 반환하는 값의 유형 
	public int calc() {
		int result = 0; // 지역변수
		if(operator.equals("+"))
			result = operand1 + operand2; // operand1.. : 인스턴스 변수
		else if(operator.equals("-"))
			result = operand1 - operand2;
		else if(operator.equals("*"))
			result = operand1 * operand2;
		else if(operator.equals("/"))
			result = operand1 / operand2;
		
		return result;
	}

}
