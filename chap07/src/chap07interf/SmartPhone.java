package chap07interf;

// �ڹ� Ŭ���� ���� ��� - <����Ŭ����> extends <����Ŭ����>
// �������̽� ���� ��� - <�����������̽�> extends <�����������̽�>[, <�����������̽�>] �ټ� 
// �������̽� ���� ���� - <Ŭ����> implements <�������̽�>[, <�������̽�>] �ټ�
// ���� ����
public class SmartPhone implements CameraPhone, Messanger, Phone, Timer {
	private String phoneNumber;
	

	@Override
	public void playBeep() {
		System.out.println("�˶� : ������ ���.");

	}

	@Override
	public void playMusic(String title) {
		System.out.printf("�˶� : %s ���� ���.", title);

	}

	@Override
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "�� ��ȭ�� �̴ϴ�.");

	}

	@Override
	public void receive() {
		System.out.println("��ȭ�� �޽��ϴ�.");
	}

	@Override
	public void sendMessange(String phoneNumber, String msg) {
		System.out.printf("[%s]�� %s �޽��� ���� \n", phoneNumber, msg);

	}

	@Override
	public void receiveMsg() {
		System.out.println("�޽����� �����߽��ϴ�.");

	}
	@Override
	public void takePicture() {
		System.out.println("������ ����ϴ�.");
	}

}
