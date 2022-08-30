package chap07a;

public class Square extends Polygon {
	// 생성자 : 객체 초기화를 담당, sub 클래스로부터 객체를 생성할때.
	// super 클래스의 객체(필드, 메소드)도 준비되어야 함
	public Square(int height, int width) {
		// 컴파일러가 묵시적으로 super 클래스의 해당 생성자를 호출
		super(height, width);
		setName("Square");
	}

	@Override 
	// annotation : 어노테이션, 애노테이션 컴파일러에게 컴파일을 잘 할수 있도록 정보를 제공
	// 재정의 : 메소드 이름, 매개변수 갯수, 타입 동일
	public int evaluate() { 
		int area = super.height * super.width;
		return area;
		
	}
	

}
