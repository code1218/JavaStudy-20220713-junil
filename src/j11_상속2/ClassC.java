package j11_상속2;

public class ClassC extends ClassA {

	public ClassC() {
		System.out.println("두번째(C) 자식 클래스 생성자 호출");
		System.out.println();
	}
	
	@Override
	public void printInfo() {
		System.out.print("두번째(C) 자식 ");
		super.printInfo();
	}
	
	@Override
	public void showData() {
		System.out.println("활을 만들어서 쏠 준비를 한다.");
		
	}
	
	public void removeData() {
		System.out.println("데이터를 삭제합니다.");
	}
	
}








