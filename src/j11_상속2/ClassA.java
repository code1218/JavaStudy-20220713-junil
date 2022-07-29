package j11_상속2;

public abstract class ClassA {
	
	public ClassA() {
		System.out.println("부모 클래스 생성자 호출");
	}
	
	public void printInfo() {
		System.out.println("부모의 정보를 출력");
		System.out.println();
	}
	
	public abstract void showData();
	
}
