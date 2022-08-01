package j13_최상위클래스;

public class ObjectMain {

	public static void main(String[] args) {
		Object object = new Object();
		
		Object test = new Test();
		
		((Test) test).testMethod();

	}

}
