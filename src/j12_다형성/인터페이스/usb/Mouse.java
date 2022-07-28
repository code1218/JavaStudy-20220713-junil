package j12_다형성.인터페이스.usb;

public class Mouse implements USB {

	@Override
	public void connect() {
		System.out.println("마우스를 연결합니다.");
		
	}

	@Override
	public void disConnect() {
		System.out.println("마우스 연결을 해제합니다.");
		
	}

}
