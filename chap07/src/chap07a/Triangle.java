package chap07a;

public class Triangle extends Polygon {
	public Triangle(int height, int width) {
		super(height, width);
		setName("Triangle");
	}

	@Override
	public int evaluate() { // �޼ҵ� ����� : ���� �Ǵ� Ȱ���
		int area = getHeight() * getWidth() /2;
		return area;
	}

}