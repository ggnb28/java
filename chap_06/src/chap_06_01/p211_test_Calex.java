package chap_06_01;
//하나의 파일에는 public class가 하나만 존재함
//파일 이름은 public class가 있는경우 public class 이름임
//public class가 없는경우 이름은 선택가능함
//class의 이름은 대문자로 시작한다.
//생성자는 class이름과 같고, 반환 유형이 없다.
public class p211_test_Calex {
	public static void main(String[] args) {
		// 기본 생성자(매개변수가 없는)를 호출하여 객체를 생성
		// calculator : 객체 참조 변수
		NewCal calculator = new NewCal();
		System.out.println(calculator.calc());
		// GC (Garbage Collection) : 
		calculator = new NewCal(23,"*",40);
		System.out.println(calculator.calc());
		ModCalculator modRef = new ModCalculator();
		System.out.println(modRef.calc());
		
		
	}

}
