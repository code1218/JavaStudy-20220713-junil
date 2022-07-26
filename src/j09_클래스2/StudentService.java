package j09_클래스2;

import java.util.Scanner;

public class StudentService {
	
	private Scanner scanner;
	private Student[] studentArray;
	
	public StudentService(Student[] studentArray) {
		this.studentArray = studentArray;
		this.scanner = new Scanner(System.in);
	}
	
	private String inputSelect() {
		System.out.print("메뉴선택 >> ");
		return scanner.nextLine();
	}
	
	private void printSelectErrorMessage() {
		System.out.println("해당 메뉴는 선택 할 수 없습니다.");
		System.out.println("다시 입력하세요.");
	}
	
	public boolean showMainMenu() {
		String select = null;
		
		System.out.println("[학생 등록 시스템]");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 조회");
		System.out.println("q. 프로그램 종료");
	
		select = inputSelect();
		
		if(select.equals("1")) {
			Student student = addStudent();
			if(student != null) {
				System.out.println(student.toString());
			}
		}else if(select.equals("2")) {
			while(showStudentSearch()) {}
			
		}else if(select.equals("q")) {
			System.out.println("프로그램 종료중...");
			return false;
		}else {
			printSelectErrorMessage();
		}
		
		System.out.println();
		
		return true;
	}
	
	private Student addStudent() {
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i] != null) {
				continue;
			}
			studentArray[i] = inputStudent();
			System.out.println("[ " + studentArray[i].getStudentName() + " ] 학생 등록 완료");
			return studentArray[i];
		}
		
		System.out.println("더 이상 학생을 등록 할 수 없습니다.");
		
		return null;
	}
	
	private Student inputStudent() {
		String studentName = null;
		int studentYear = 0;
		String studentAddress = null;
		String studentPhone = null;
		
		System.out.println("[학생 등록]");
		System.out.print("이름 >> ");
		studentName = scanner.nextLine();
		
		System.out.print("학년 >> ");
		studentYear = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("주소 >> ");
		studentAddress = scanner.nextLine();
		
		System.out.print("연락처 >> ");
		studentPhone = scanner.nextLine();
		
		return new Student(studentName, studentYear, studentAddress, studentPhone);
	}
	
	private boolean showStudentSearch() {
		String select = null;
		
		System.out.println("[학생 조회]");
		System.out.println("1. 학생 전체 조회");
		System.out.println("2. 이름으로 검색");
		System.out.println("b. 뒤로가기");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			showStudentList();
			
		}else if(select.equals("2")) {
			showSearchStudent();
			
		}else if(select.equals("b")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return false;
		}else {
			printSelectErrorMessage();
		}
		System.out.println();
		return true;
		
	}
	
	private void showStudentList() {
		System.out.println("[학생 전체 조회]");
		System.out.println("이름\t\t학년\t\t주소\t\t연락처");
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i] != null) {
				System.out.println(studentArray[i].getStudentName() + "\t\t" 
						+ studentArray[i].getStudentYear() + "\t\t" 
						+ studentArray[i].getStudentAddress() + "\t\t"
						+ studentArray[i].getStudentPhone());				
			}
		}
		System.out.println();
	}
	
	private void showSearchStudent() {
		String searchName = null;
		
		System.out.println("[학생 이름으로 검색]");
		System.out.print("이름 >> ");
		searchName = scanner.nextLine();
		
		Student searchStudent = searchStudentByStudentName(searchName);
		if(searchStudent != null) {
			System.out.println(searchStudent.toString());
		}
		
	}
	
	private Student searchStudentByStudentName(String searchName) {
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i] != null) {
				String studentName = studentArray[i].getStudentName();
				if(searchName.equals(studentName)) {
					return studentArray[i];
				}
			}
		}
		System.out.println("해당 이름의 학생은 존재하지 않습니다.");
		return null;
	}

}






