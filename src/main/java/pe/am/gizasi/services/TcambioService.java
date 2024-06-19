package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Tcambio;
import pe.am.gizasi.repository.TcambioRepository;

import java.util.List;

@Service
public class TcambioService {

    private final TcambioRepository tcambioRepository;

    @Autowired
    public TcambioService(TcambioRepository tcambioRepository) {
        this.tcambioRepository = tcambioRepository;
    }

    public List<Tcambio> getAllTcambios() {
        List<Tcambio> tcambios = tcambioRepository.findAll();
        if (tcambios.isEmpty()) {
            throw new RuntimeException("No hay tipo de cambios disponibles");
        }
        return tcambios;
    }
}