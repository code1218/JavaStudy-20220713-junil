package j12_다형성.인터페이스;

import java.util.Scanner;

import j12_다형성.인터페이스.usb.KeyBoard;
import j12_다형성.인터페이스.usb.Mouse;

public class ComputerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //스캐너 객체 필요해서 생성(입력해야해서)
		
		String select = null; //메뉴 뭐 선택했는지 저장하기 위해서
		
		ConnectionTerminal connectionTerminal = null; //?
		
		System.out.println("[컴퓨터 연결 관리]");
		System.out.println("1. 모니터 연결");
		System.out.println("2. 빔프로젝트 연결");
		System.out.print("선택 >> ");
		
		select = scanner.nextLine(); //내가 입력한 메뉴 번호 저장
		
		if(select.equals("1")) { //조건에 따라 어떤 출력장치 선택할건지
			connectionTerminal = new Monitor();
			//모니터 객체 생성해서 connectionTerminal변수에 대입(업캐스팅)
		}else if(select.equals("2")) {
			connectionTerminal = new BeamProject();
		}else {
			System.out.println("메뉴를 잘 못 선택하셨습니다.");
		}
		
		Computer computer = new Computer(connectionTerminal, new Mouse(), new KeyBoard());
		/*
		 * 
		 */
		
		computer.powerOn();
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		computer.powerOff();

	}

}
