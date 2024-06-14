package pe.am.gizasi.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
	
	private String userName;
	private String userPassword;
	private String firstName;
	private String lastName;
	private String country;
	
}
