package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserArrayList {
	private List<User> userList;
	private Scanner scanner;
	
	// 생성자 호출시에 객체 생성
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		//입력
		System.out.print("아이디: ");
		System.out.print("비밀번호: ");
		System.out.print("이름: ");
		System.out.print("이메일: ");
		
		//User 객체 생성
		
		//userList에 add하기
		
	}
	
	public void printUserList() {
		//userList
		/*
		 * 아이디 	> aaa
		 * 비밀번호 > 1234
		 * 이름 	> 김준일
		 * 이메일 	> aaa@naver.com
		 * 
		 * 아이디	> bbb
		 * 비밀번호 > 2222
		 * 이름		> 김준이
		 * 이메일	> bbb@naver.com
		 */
		
	}
	
	public void removeUser() {
		//아이디 입력
		System.out.print("아이디: ");
	}

	public static void main(String[] args) {
		/*
		 * [ 사용자 관리 프로그램 ]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 */

	}

}
