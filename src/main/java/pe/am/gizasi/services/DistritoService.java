package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Distrito;
import pe.am.gizasi.repository.DistritoRepository;

import java.util.List;

@Service
public class DistritoService {

    private final DistritoRepository distritoRepository;

    @Autowired
    public DistritoService(DistritoRepository distritoRepository) {
        this.distritoRepository = distritoRepository;
    }

    public List<Distrito> getAllDistritos() {
        List<Distrito> distritos = distritoRepository.findAll();
        if (distritos.isEmpty()) {
            throw new RuntimeException("No hay clientes disponibles");
        }
        return distritos;
    }
}