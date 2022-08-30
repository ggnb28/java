package chap07a;

public class Triangle extends Polygon {
	public Triangle(int height, int width) {
		super(height, width);
		setName("Triangle");
	}

	@Override
	public int evaluate() { // 메소드 선언부 : 사용법 또는 활용법
		int area = getHeight() * getWidth() /2;
		return area;
	}

}
