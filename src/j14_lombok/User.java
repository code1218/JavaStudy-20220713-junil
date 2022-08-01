package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
	
	private String email;
	private String name;
	@NonNull
	private String username;
	@NonNull
	private String password;
	

}









