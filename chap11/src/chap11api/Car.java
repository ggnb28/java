package chap11api;

public class Car {
	private double speed;
	public void speedUp() {
		speed = speed * (1 + Math.random()); // Math 클래스 : 수학관련
		System.out.println("속도 관련" + speed);
	}

}
