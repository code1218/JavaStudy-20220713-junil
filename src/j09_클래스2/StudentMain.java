package j09_클래스2;

public class StudentMain {
	
	public static void main(String[] args) {
		int studentCount = 2;
		
		Student[] studentArray = new Student[studentCount];
		
		StudentService service = new StudentService(studentArray);
		
		while(service.showMainMenu()) {}
		System.out.println("프로그램 종료");
		
	}
	
}
