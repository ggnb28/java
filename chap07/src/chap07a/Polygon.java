package chap07a;

// 다각형의 넓이를 구하기 위함 클래스를 정의하고, (객체생성). 활용
public abstract class Polygon {
	// 삼각형, 직사각형, 정사각형, 평행사변형, 사다리꼴
     int height; // 세로
     int width; // 가로
     int area; // 넓이
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
	
	public abstract int evaluate(); // 추상 메소드 : 상속받는 쪽에서 구현
	
}
