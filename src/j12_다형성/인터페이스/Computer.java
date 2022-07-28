package j12_다형성.인터페이스;

import j12_다형성.인터페이스.usb.USB;

public class Computer {
	
	private ConnectionTerminal connectionTerminal;
	private USB usb1;
	private USB usb2;
	
	public Computer(ConnectionTerminal connectionTerminal, USB usb1, USB usb2) {
		this.connectionTerminal = connectionTerminal;
		this.usb1 = usb1;
		this.usb2 = usb2;
	}

	public void powerOn() {
		System.out.println("컴퓨터의 전원를 켭니다.");
		connectedDisplay();
		showConnectionTerminalVersion();
		if(usb1 != null) usb1.connect();
		if(usb2 != null) usb2.connect();
		soundOn();
	}
	
	public void powerOff() {
		if(usb1 != null) usb1.disConnect();
		if(usb2 != null) usb2.disConnect();
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
	
	private void showConnectionTerminalVersion() {
		if(connectionTerminal instanceof HDMI) {
			System.out.println("HDMI Version: " + HDMI.VERSION);
			
		}else if(connectionTerminal instanceof VGA) {
			System.out.println("VGA Version: " + VGA.VERSION);
			
		}else {
			System.out.println("Version Information is missing");
		}
	}
	
}











