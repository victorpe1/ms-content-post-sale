package pe.am.gizasi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.am.gizasi.model.UserModel;
import pe.am.gizasi.repository.UsersRepository;
import pe.am.gizasi.services.UserService;

import java.util.Base64;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class UserController {

  @Autowired
  private UserService userService;


  @GetMapping("/login")
  public ResponseEntity<UserModel> login(@RequestHeader("Authorization") String authorizationHeader) {
    if (authorizationHeader != null && authorizationHeader.startsWith("Basic")) {
      String base64Credentials = authorizationHeader.substring("Basic".length()).trim();
      String credentials = new String(Base64.getDecoder().decode(base64Credentials));

      String[] parts = credentials.split(":");
      String usuario = parts[0];
      String password = parts[1];

      UserModel usuarioAutenticado = userService.verificarCredenciales(usuario, password);
      if (usuarioAutenticado != null) {
        usuarioAutenticado.setClave("XXXXX");
        return ResponseEntity.ok(usuarioAutenticado);
      } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
      }
    } else {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }
  }
}
