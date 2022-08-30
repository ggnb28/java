package chap07interf;

// 자바 클래스 단일 상속 - <서브클래스> extends <수퍼클래스>
// 인터페이스 다중 상속 - <서브인테페이스> extends <수퍼인테페이스>[, <수퍼인테페이스>] 다수 
// 인터페이스 다중 구현 - <클래스> implements <인터페이스>[, <인터페이스>] 다수
// 다중 구현
public class SmartPhone implements CameraPhone, Messanger, Phone, Timer {
	private String phoneNumber;
	

	@Override
	public void playBeep() {
		System.out.println("알람 : 비프음 재생.");

	}

	@Override
	public void playMusic(String title) {
		System.out.printf("알람 : %s 음악 재생.", title);

	}

	@Override
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "에 전화를 겁니다.");

	}

	@Override
	public void receive() {
		System.out.println("전화를 받습니다.");
	}

	@Override
	public void sendMessange(String phoneNumber, String msg) {
		System.out.printf("[%s]로 %s 메시지 전송 \n", phoneNumber, msg);

	}

	@Override
	public void receiveMsg() {
		System.out.println("메시지가 도착했습니다.");

	}
	@Override
	public void takePicture() {
		System.out.println("사진을 찍습니다.");
	}

}
