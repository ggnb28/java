package chap07a;

import java.util.ArrayList;

public class PolygonExample {

	public static void main(String[] args) {
		// Polygon ���� poly��� ���������� ���
		// Triangle, Square, Trapezoid .. ��ӹ���, �������� Ư¡�� ����
		
//		
		// ����1 ��������poly �ϳ��� ��� ǥ���ϱ�
//		Polygon poly = new Triangle(50, 80);
//		System.out.println("���̴� : " + poly.evaluate());
//		poly = new Square(50, 80);
//		System.out.println("���̴� : " + poly.evaluate());
//		poly = new Trapezoid(50, 80, 60);
//		System.out.println("���̴� : " + poly.evaluate());
		
		
		// ����2	arrylist�� �Ἥ ��� ǥ���ϱ�
		ArrayList<Polygon> arrPoly = new ArrayList<>();
		
		Polygon poly = new Triangle(50, 80);
//		System.out.println("���̴� : " + poly.evaluate());
		arrPoly.add(poly);
		
		poly = new Square(50, 80);
//		System.out.println("���̴� : " + poly.evaluate());
		arrPoly.add(poly);
		
		poly = new Trapezoid(50, 80, 60);
//		System.out.println("���̴� : " + poly.evaluate());
		arrPoly.add(poly);
		for(Polygon p : arrPoly) {
			
		// ���� 2-1
//			System.out.println("���̴� : " + p.evaluate());
//		}
		
		// ���� 2-2
		//�Ű������� ������ ���� �ٸ��� ���� : (�Ű�����) ������	
			whoIs(p); 
		}
		String sRef = "Hello";
		Integer iRef = Integer.valueOf(100); // Wrapper class
		Integer iRef2 = 30; // AutoBoxing
		iRef = iRef2;
		
		Object o = (Object) iRef;
		if(o instanceof String) {//where are you?
			sRef = (String) o;
			sRef.substring(3);
		}
		
	}
	public static void whoIs(Polygon p) {
		if(p instanceof Triangle)
			System.out.println("�ﰢ���� ���̴� : " + p.evaluate());
		else if(p instanceof Square)
			System.out.println("�簢���� ���̴� : " + p.evaluate());
		else if(p instanceof Rectangle)
			System.out.println("���簢���� ���̴� : " + p.evaluate());
		else if(p instanceof Trapezoid)
			System.out.println("��ٸ����� ���̴� : " + p.evaluate());
		else;
			
		
		
		
		// ����3 �⺻��
//		Triangle triangle = new Triangle(50, 80);
//		System.out.println("���̴� : " + triangle.evaluate());
//		
//		Square square = new Square(80, 80);
//	    System.out.println("���̴� : " + square.evaluate());
////	    SquareB squareB = new SquareB(80);
////	    System.out.println("���̴� : " + squareB.evaluate());
//	    
//	    Trapezoid trapezoid = new Trapezoid(50, 80, 60);
//	    System.out.println("���̴� : " + trapezoid.evaluate());
				
	}

}