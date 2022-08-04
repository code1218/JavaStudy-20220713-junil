package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import j17_컬렉션.ArrayList.User;

public class Dictionary {

	public static void main(String[] args) {
		
		Map<String, String> dict = new HashMap<String, String>();
		dict.put("축구", "축구 -> soccer");
		dict.put("야구", "야구 -> baseball");
		dict.put("농구", "농구 -> basketball");
		dict.put("골프", "골프 -> golf");
		
		Map<String, User> userDict = new HashMap<String, User>();
		String username = "junil";
		userDict.put(username, User.builder().username(username).password("1234").build());

		if(userDict.containsKey("junil")) {
			System.out.println(userDict.get("junil"));
		}
		
		
		Scanner scanner = new Scanner(System.in);
		
		String searchText = null;
		
		while(true) {
			System.out.println("[사전 검색 기능]");
			System.out.println("# 프로그램 종료명령(exit)");
			
			System.out.print("검색어: ");
			searchText = scanner.nextLine();
			
			if(searchText.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else if(dict.containsKey(searchText)) {
				System.out.println(dict.get(searchText));
				
			}else {
				System.out.println("지원하지 않는 단어입니다.");
			}
			System.out.println();
		}
		
		/*
		 * 축구 -> soccer
		 * 야구 -> baseball
		 * 농구 -> basketball
		 * 골프 -> golf
		 * 
		 * 
		 */
		
	}

}









