package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Almacen;
import pe.am.gizasi.model.Client;
import pe.am.gizasi.repository.AlmacenRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlmacenService {
    @Autowired
    private AlmacenRepository almacenRepository;

    public List<Almacen> obtenerTodosLosAlmacenes() {
        return almacenRepository.findAll().stream().collect(Collectors.toList());
    }

    public List<Almacen> getAllAlmacens() {
        List<Almacen> almacenes = almacenRepository.findAll();
        if (almacenes.isEmpty()) {
            throw new RuntimeException("No hay almacenes disponibles");
        }
        return almacenes;
    }
}
