package chap11api;

public class Car {
	private double speed;
	public void speedUp() {
		speed = speed * (1 + Math.random()); // Math Ŭ���� : ���а���
		System.out.println("�ӵ� ����" + speed);
	}

}
