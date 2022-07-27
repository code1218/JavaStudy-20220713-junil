package j12_다형성.추상.computer;

public abstract class Computer {
	public abstract void onKeyPress(); //키보드 입력
	public abstract void onDisplay(); //화면표시
	
	public void onSound() {
		System.out.println("소리를 출력합니다.");
	}
}
