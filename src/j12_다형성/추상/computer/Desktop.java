package j12_다형성.추상.computer;

public abstract class Desktop extends Computer {
	@Override
	public void onKeyPress() {
		System.out.println("컴퓨터의 키보드 입력을 받는다.");
		
	}
	
	public abstract void onMouseClick();
}
