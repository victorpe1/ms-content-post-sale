package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.am.gizasi.model.UserModel;
import pe.am.gizasi.repository.UsersRepository;


@Service
public class UserService{

  @Autowired
  private UsersRepository userRepository;

  public UserModel verificarCredenciales(String usuario, String password) {
    return userRepository.findByUsuarioAndClave(usuario, password);
  }
}
