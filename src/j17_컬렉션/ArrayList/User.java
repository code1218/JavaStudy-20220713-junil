package j17_컬렉션.ArrayList;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private String username;
	private String password;
	private String name;
	private String email;
}
