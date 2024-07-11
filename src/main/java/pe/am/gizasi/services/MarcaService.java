package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Marca;
import pe.am.gizasi.repository.DistritoRepository;
import pe.am.gizasi.repository.MarcaRepository;

import java.util.List;

@Service
public class MarcaService {

  private final MarcaRepository marcaRepository;

  @Autowired
  public MarcaService(MarcaRepository marcaRepository) {
    this.marcaRepository = marcaRepository;
  }

  public List<Marca> getAllMarcas() {
    List<Marca> marcaList = marcaRepository.findAll();
    if (marcaList.isEmpty()) {
      throw new RuntimeException("No hay marcas disponibles");
    }
    return marcaList;
  }
}
