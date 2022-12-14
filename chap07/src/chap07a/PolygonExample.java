package chap07a;

import java.util.ArrayList;

public class PolygonExample {

	public static void main(String[] args) {
		// Polygon 형의 poly라는 참조변수를 사용
		// Triangle, Square, Trapezoid .. 상속받음, 공통적인 특징을 가짐
		
//		
		// 유형1 참조변수poly 하나로 묶어서 표현하기
//		Polygon poly = new Triangle(50, 80);
//		System.out.println("넓이는 : " + poly.evaluate());
//		poly = new Square(50, 80);
//		System.out.println("넓이는 : " + poly.evaluate());
//		poly = new Trapezoid(50, 80, 60);
//		System.out.println("넓이는 : " + poly.evaluate());
		
		
		// 유형2	arrylist를 써서 묶어서 표현하기
		ArrayList<Polygon> arrPoly = new ArrayList<>();
		
		Polygon poly = new Triangle(50, 80);
//		System.out.println("넓이는 : " + poly.evaluate());
		arrPoly.add(poly);
		
		poly = new Square(50, 80);
//		System.out.println("넓이는 : " + poly.evaluate());
		arrPoly.add(poly);
		
		poly = new Trapezoid(50, 80, 60);
//		System.out.println("넓이는 : " + poly.evaluate());
		arrPoly.add(poly);
		for(Polygon p : arrPoly) {
			
		// 유형 2-1
//			System.out.println("넓이는 : " + p.evaluate());
//		}
		
		// 유형 2-2
		//매개변수의 유형에 따라 다른게 동작 : (매개변수) 다형성	
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
			System.out.println("삼각형의 넓이는 : " + p.evaluate());
		else if(p instanceof Square)
			System.out.println("사각형의 넓이는 : " + p.evaluate());
		else if(p instanceof Rectangle)
			System.out.println("정사각형의 넓이는 : " + p.evaluate());
		else if(p instanceof Trapezoid)
			System.out.println("사다리꼴의 넓이는 : " + p.evaluate());
		else;
			
		
		
		
		// 유형3 기본형
//		Triangle triangle = new Triangle(50, 80);
//		System.out.println("넓이는 : " + triangle.evaluate());
//		
//		Square square = new Square(80, 80);
//	    System.out.println("넓이는 : " + square.evaluate());
////	    SquareB squareB = new SquareB(80);
////	    System.out.println("넓이는 : " + squareB.evaluate());
//	    
//	    Trapezoid trapezoid = new Trapezoid(50, 80, 60);
//	    System.out.println("넓이는 : " + trapezoid.evaluate());
				
	}

}
