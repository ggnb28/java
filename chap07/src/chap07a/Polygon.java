package chap07a;

// �ٰ����� ���̸� ���ϱ� ���� Ŭ������ �����ϰ�, (��ü����). Ȱ��
public abstract class Polygon {
	// �ﰢ��, ���簢��, ���簢��, ����纯��, ��ٸ���
     int height; // ����
     int width; // ����
     int area; // ����
	 int depth;
	private String name;
	
	
	public Polygon(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public abstract int evaluate(); // �߻� �޼ҵ� : ��ӹ޴� �ʿ��� ����
	
}
