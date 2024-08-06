package pe.am.gizasi.config;

import java.io.IOException;
import java.util.Base64;
import java.util.Collections;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import pe.am.gizasi.model.UserModel;
import pe.am.gizasi.services.UserService;

@Component
public class CustomAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private UserService userService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		String authorizationHeader = request.getHeader("Authorization");
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {

			String base64Credentials = authorizationHeader.substring("Bearer".length()).trim();
			String credentials = new String(Base64.getDecoder().decode(base64Credentials));

			String[] parts = credentials.split(":");
			String username = parts[0];
			String password = parts[1];

			UserModel userDetails = userService.verificarCredenciales(username, password);

			// Verificar la contraseña (esto debe hacerse usando un password encoder en producción)
			if (userDetails != null) {

				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						userDetails, null,
						Collections.singleton(new SimpleGrantedAuthority("ROLE_ADM"))
				);

				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		}

		chain.doFilter(request, response);
	}
}
