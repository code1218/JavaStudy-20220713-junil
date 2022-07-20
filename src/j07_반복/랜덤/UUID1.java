package j07_반복.랜덤;

import java.util.UUID;

public class UUID1 {

	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(uuid);
	}

}
