package j12_다형성.인터페이스;

public class Computer {
	
	private ConnectionTerminal connectionTerminal;
	
	public Computer(ConnectionTerminal connectionTerminal) {
		this.connectionTerminal = connectionTerminal;
	}

	public void powerOn() {
		System.out.println("컴퓨터의 전원를 켭니다.");
		connectedDisplay();
		soundOn();
	}
	
	public void powerOff() {
		disConnectedDisplay();
		System.out.println("컴퓨터의 전원을 끕니다.");
		
	}
	
	private void connectedDisplay() {
		System.out.println("출력 장치를 연결합니다.");
		connectionTerminal.connect();
	}
	
	private void disConnectedDisplay() {
		System.out.println("출력 장치 연결을 해제합니다.");
		connectionTerminal.disConnect();
	}
	
	private void soundOn() {
		if(connectionTerminal instanceof HDMI) {
			((HDMI) connectionTerminal).soundOutput();
			System.out.println("소리를 출력합니다.");
			
		}else {
			System.out.println("연결된 스피커가 없습니다.");
			
		}
	}
	
}











