package j15_스태틱;

import j15_스태틱.싱글톤.KIA;

public class StudentMain {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		
		for(int i = 0; i < student.length; i++) {
			student[i] = new Student("김준" + (i + 1));
		}
		
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}

	}

}
