package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//값 추가
		list.add("java");
		
		list.add("python");
		list.add("C");
		list.add("html");
		
		//원하는 위치에 값 추가
		list.add(1, "css");
		
		// 리스트의 크기
		System.out.println("list 크기: " + list.size());
		
		// 리스트 toString()
		System.out.println(list);
		
		// 리스트에서 해당 인덱스로 값 찾기
		String subject = list.get(0);
		System.out.println("0번 인덱스의 값: " + subject);
		
		// 리스트에서 인덱스 찾는 방법
		int findIndex = list.indexOf("python");
		System.out.println("python이 있는 위치: " + findIndex);
		
		// 해당 인덱스 위치의 값을 수정
		list.set(3, "c++");
		System.out.println(list);
		
		// 해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("python");
		tempList.add("c++");
		tempList.add("spring");
		System.out.println(tempList);
		
		boolean contains = list.contains("java");
		boolean containsAll = list.containsAll(tempList);
		System.out.println("contains: " + contains);
		System.out.println("containsAll: " + containsAll);
		
		// 다른 컬렉션의 데이터를 모두 추가
		list.addAll(tempList);
		System.out.println(list);
		
		// 값 삭제
		//list.remove("python");
		System.out.println(list);
		//list.remove(5);
		System.out.println(list);
		//list.removeAll(tempList);
		System.out.println(list);
		
		//해당 컬렉션을 포함하는 것을 제외하고 다 지움
		list.retainAll(tempList); 
		System.out.println(list);
		
		// 리스트가 비었는지 확인
		System.out.println(list.isEmpty());
		
		// 리스트 전체 비우기
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		List<String> asList = Arrays.asList(new String[] {"java", "python", "c++", "html"});
		System.out.println(asList);
		list.addAll(asList);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("<<<< foreach >>>>");
		
		// foreach
		for(String str : list) {
			System.out.println(str);
		}
		
		String roles = "USER,ADMIN,TEST_USER";
		String[] roleArray = roles.split(",");
		System.out.println(roleArray[0]);
		System.out.println(roleArray[1]);
		System.out.println(roleArray[2]);
		Arrays.asList(roleArray).forEach(arg -> {
			System.out.println("role: " + arg);
		});
	
	}

}










