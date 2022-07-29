package j09_클래스3;

public class Student extends Person {
	private String schoolName;
	private int studentCode;
	private int studentYear;
	
	public Student(String name, int age, String schoolName, int studentCode, int studentYear) {
		super(name, age);
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.studentYear = studentYear;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}
	public int getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}
	@Override
	public String toString() {
		return super.toString() + ", Student [schoolName=" + schoolName + ", studentCode=" + studentCode + ", studentYear=" + studentYear
				+ "]";
	}

	@Override
	public String mealTime() {
		return "점심시간";
	}
	
	
	
}






