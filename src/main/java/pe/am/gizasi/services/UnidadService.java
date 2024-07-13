package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Unidades;
import pe.am.gizasi.repository.UnidadRepository;

import java.util.List;

@Service
public class UnidadService {

  private final UnidadRepository unidadRepository;

  @Autowired
  public UnidadService(UnidadRepository unidadRepository) {
    this.unidadRepository = unidadRepository;
  }

  public List<Unidades> getAllUnidades() {
    List<Unidades> unidadesList = unidadRepository.findAll();
    if (unidadesList.isEmpty()) {
      throw new RuntimeException("No hay unidades disponibles");
    }
    return unidadesList;
  }
}
