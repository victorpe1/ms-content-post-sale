package pe.am.gizasi.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.am.gizasi.user.Role;
import pe.am.gizasi.user.User;
import pe.am.gizasi.user.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthService {
 
	private final UserRepository userRepository;
	private final JwtService jwtService;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	
	public AuthResponse login(LoginRequest request) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(), request.getUserPassword()));
		UserDetails user = userRepository.findByUserName(request.getUserName()).orElseThrow();
		String token =jwtService.getToken(user);
		
		return AuthResponse.builder()
				.token(token)
				.build();
	}
	
	public AuthResponse register(RegisterRequest request) {
		
		User user = User.builder()
				.username(request.getUserName())
				.password(passwordEncoder.encode(request.getUserPassword()))
				.firstname(request.getFirstName())
				.lastname(request.getLastName())
				.country(request.getCountry())
				.role(Role.USER)
				.build();
		
		userRepository.save(user);
		
		return AuthResponse.builder()
				.token(jwtService.getToken(user))
				.build();
	}

}
