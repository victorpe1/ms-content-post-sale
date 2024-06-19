package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Condiciones;
import pe.am.gizasi.repository.CondicionesRepository;

import java.util.List;

@Service
public class CondicionesService {

    private final CondicionesRepository condicionesRepository;

    @Autowired
    public CondicionesService(CondicionesRepository condicionesRepository) {
        this.condicionesRepository = condicionesRepository;
    }

    public List<Condiciones> getAllCondicones() {
        List<Condiciones> condiciones = condicionesRepository.findAll();
        if (condiciones.isEmpty()) {
            throw new RuntimeException("No hay condiciones disponibles");
        }
        return condiciones;
    }
}

