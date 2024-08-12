package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Marca;
import pe.am.gizasi.model.Medida;
import pe.am.gizasi.repository.MarcaRepository;
import pe.am.gizasi.repository.MedidaRepository;

import java.util.List;

@Service
public class MedidaService {

  private final MedidaRepository medidaRepository;

  @Autowired
  public MedidaService(MedidaRepository medidaRepository) {
    this.medidaRepository = medidaRepository;
  }

  public List<Medida> getAllMedidas() {
    List<Medida> medidaList = medidaRepository.findAll();
    if (medidaList.isEmpty()) {
      throw new RuntimeException("No hay medidas disponibles");
    }
    return medidaList;
  }
}
