package chapp_06_01_b;

// Gugudan Ŭ������ ���� ��Ű���� �ִ� ��� (���� import �Ǿ��ų�) 
public class SubGugudan extends Gugudan {
	public SubGugudan(int dan) {
//		super(dan);
		//this ([�Ű��������]) : ���� Ŭ������ �����ڸ� ȣ��
		//vs. super ([�Ű��������]) : �θ�Ŭ����(����Ŭ����)�� �����ڸ� ȣ��
		}
	
	
	// direction : up/down - up dan -> 9��, down 2�� -> dan
	// �޼ҵ带 ��ø(overloading)
	public void printFrom(int dan, String direction) {
		System.out.println("�޼ҵ� �����ε�");
	}

}
