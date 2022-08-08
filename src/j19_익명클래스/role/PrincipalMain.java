package j19_익명클래스.role;

public class PrincipalMain {

	public static void main(String[] args) {
		User user = User.builder()
				.username("junil")
				.password("1234")
				.roles("ROLE_USER,ROLE_ADMIN,ROLE_MANAGER")
				.build();
		
		User user2 = User.builder()
				.username("junil2")
				.password("1111")
				.roles("ROLE_USER")
				.build();
		
		PrincipalDetailse principalDetailse = new PrincipalDetailse(user);
		PrincipalDetailse principalDetailse2 = new PrincipalDetailse(user2);
		
		printPrincipalData(principalDetailse);
		printPrincipalData(principalDetailse2);

	}

	public static void printPrincipalData(PrincipalDetailse principalDetailse) {
		System.out.println("[ principla 정보 출력 ]");
		
		System.out.println("username: " + principalDetailse.getUsername());
		System.out.println("password: " + principalDetailse.getPassword());
		
		for(GrantedAuthority grantedAuthority : principalDetailse.getAuthorities()) {
			System.out.println("권한: " + grantedAuthority.getAuthority());
		}
		System.out.println();
	}
}









