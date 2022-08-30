package chap07interf;

public class SmartPhoneExample {
	// �������̽����� �����ϰ�,
	// ���߱���(multiple implementation)�� ���� Ŭ������ ����
	// ������ Ŭ�����κ��� ��ü�� �����ϰ�
	// ������ ��ü�� ��ȣ�ۿ��� ���� ������ �ذ�
	
	// Java�� ���߻��� �������� ����, �� extends �ڿ� �ϳ��� ��Ÿ��
	// �������̽��� ���� ������ ������, �� implements �ڿ� �������� ��Ÿ��������
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call(SmartPhone.PHONE_NUMBER);
		sp.playMusic("�����Ǽ�");
		sp.sendMessange(SmartPhone.PHONE_NUMBER, "��!�����");
		Timer t = sp; // sp�� �����ϴ� ��ü�� Timer �������̽� ������ ����ü
		((SmartPhone) t).call(SmartPhone.PHONE_NUMBER);
		sp.call(SmartPhone.PHONE_NUMBER);
		
	}

}
