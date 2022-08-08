package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private String username;
	private String password;
	private String roles;
	
	public List<String> getRoleList() {
		
		if(this.roles.length() > 0) {
			return Arrays.asList(this.roles.replaceAll(" ", "").split(","));
		}
		
		return new ArrayList<String>();
	}
}






