package j12_다형성.추상.computer;

public class Laptop extends Computer {

	@Override
	public void onKeyPress() {
		System.out.println("노트북에서 키보드 입력을 받는다.");
		
	}

	@Override
	public void onDisplay() {
		System.out.println("노트북 화면을 출력한다.");
		
	}

	
}
