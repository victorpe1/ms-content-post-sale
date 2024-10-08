package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Client;
import pe.am.gizasi.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        List<Client> clientes = clientRepository.findAll();
        if (clientes.isEmpty()) {
            throw new RuntimeException("No hay clientes disponibles");
        }
        return clientes;
    }
}
