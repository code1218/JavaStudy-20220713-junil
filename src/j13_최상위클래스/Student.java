package j13_최상위클래스;

import java.util.Objects;

public class Student {
	private int studentCode;
	private String name;
	
	public Student(int studentCode, String name) {
		super();
		this.studentCode = studentCode;
		this.name = name;
	}

//	@Override
//	public boolean equals(Object obj) {
//		
//		Student student = (Student) obj;
//		
//		boolean result = studentCode == student.studentCode
//				// && name.equals(student.name)
//				&& Objects.equals(name, student.name);
//				
//		
//		return result;
//	}
	
	public void addStudent(int studentCode, String name) {
		System.out.println("학생을 추가합니다.");
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentCode, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentCode == other.studentCode;
	}
	
	
}






