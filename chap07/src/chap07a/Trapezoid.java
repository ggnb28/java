package chap07a;

public class Trapezoid extends Polygon {
	private int upper; // ????
	
	public Trapezoid(int height, int width, int upper) {
		super(height, width); // width : ?Ʒ???
		this.upper = upper;
		setName("Trapezoid");
	}
	public int getUpper() {
		return upper;
	}

	@Override
	public int evaluate() {
		int area = (getWidth() + getUpper()) * getHeight() /2;
		return area;
	}
}
