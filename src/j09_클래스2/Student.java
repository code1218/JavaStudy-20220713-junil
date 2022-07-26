package j09_클래스2;

public class Student {
	private String studentName;
	private int studentYear;
	private String studentAddress;
	private String studentPhone;
	
	//기본 생성자
	public Student() {
		//System.out.println("학생 객체(인스턴스)를 생성할 때 호출됨.(NO)");
	}

	//전체 생성자
	public Student(String studentName, int studentYear, String studentAddress, String studentPhone) {
		super();
		//System.out.println("학생 객체(인스턴스)를 생성할 때 호출됨.(ALL)");
		this.studentName = studentName;
		this.studentYear = studentYear;
		this.studentAddress = studentAddress;
		this.studentPhone = studentPhone;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentYear=" + studentYear + ", studentAddress="
				+ studentAddress + ", studentPhone=" + studentPhone + "]";
	}
	
	
}






