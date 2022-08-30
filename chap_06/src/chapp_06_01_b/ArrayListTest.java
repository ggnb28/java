package chapp_06_01_b;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayListExt<String> ale = new ArrayListExt<String>();
		
		
//		Integer k = new Integer(100); // k는 Integer 클래스형 변수
//		// implicit type conversion (묵시적 형변환) : 오토박싱/언박싱
//		int j = 50;
//		System.out.println(Integer.toBinaryString(k));
		
		
		ale.add(new String("고객")); //index 0에 저장
		ale.add("경험");
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		ale.add("비즈니스");
		ale.add("분석가 과정");
		// for문 : 반복횟수가 정해진 경우 사용, 순차접근가능,
		// 제어변수에 따른 접근
		
		for(int i =0; i< ale.size();i++) 
			System.out.println(ale.get(i)+" ");
		for(String s : ale) // foreach statement : collection 객체의 순차 접근
			System.out.println(s + " ");
			
			
		
	}

}
