package chap_06_01;
//�ϳ��� ���Ͽ��� public class�� �ϳ��� ������
//���� �̸��� public class�� �ִ°�� public class �̸���
//public class�� ���°�� �̸��� ���ð�����
//class�� �̸��� �빮�ڷ� �����Ѵ�.
//�����ڴ� class�̸��� ����, ��ȯ ������ ����.
public class p211_test_Calex {
	public static void main(String[] args) {
		// �⺻ ������(�Ű������� ����)�� ȣ���Ͽ� ��ü�� ����
		// calculator : ��ü ���� ����
		NewCal calculator = new NewCal();
		System.out.println(calculator.calc());
		// GC (Garbage Collection) : 
		calculator = new NewCal(23,"*",40);
		System.out.println(calculator.calc());
		ModCalculator modRef = new ModCalculator();
		System.out.println(modRef.calc());
		
		
	}

}
