package chap07a;

public class Square extends Polygon {
	// ������ : ��ü �ʱ�ȭ�� ���, sub Ŭ�����κ��� ��ü�� �����Ҷ�.
	// super Ŭ������ ��ü(�ʵ�, �޼ҵ�)�� �غ�Ǿ�� ��
	public Square(int height, int width) {
		// �����Ϸ��� ���������� super Ŭ������ �ش� �����ڸ� ȣ��
		super(height, width);
		setName("Square");
	}

	@Override 
	// annotation : ������̼�, �ֳ����̼� �����Ϸ����� �������� �� �Ҽ� �ֵ��� ������ ����
	// ������ : �޼ҵ� �̸�, �Ű����� ����, Ÿ�� ����
	public int evaluate() { 
		int area = super.height * super.width;
		return area;
		
	}
	

}
