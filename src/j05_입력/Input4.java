package j05_입력;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		/*
		 * 이름을 입력해 주세요: (여러명 입력 가능)
		 * names = 김준일 강민지 박진관 오유리 조문기 (nextLine)
		 * phones = 9988 1916, 1234 5678, 1111 2222 (nextLine) 
		 * 
		 * 김준일님, 강민지님, 박진관님, 오유리님, 조문기님
		 * 010-9988-1916/010-1234-5678/010-1111-2222
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		
		String names = null;
		String phones = null;
		
		System.out.print("이름을 입력해 주세요.(여러명 입력 가능): ");
		names = scanner.nextLine();
		System.out.print("연락처를 입력해 주세요.(여러개 입력 가능): ");
		phones = scanner.nextLine();
		
		names = names.replaceAll(" ", "님, ") + "님";
		phones = "010-" + phones.replaceAll(", ", "/010-")
				.replaceAll(" ", "-");
		
		System.out.println(names);
		System.out.println(phones);
		
	}

}












