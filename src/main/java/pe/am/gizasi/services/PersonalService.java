package pe.am.gizasi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.model.Personal;
import pe.am.gizasi.repository.PersonalRepository;

import java.util.List;

@Service
public class PersonalService {

    private final PersonalRepository personalRepository;

    @Autowired
    public PersonalService(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    public List<Personal> getAllPersonals() {
        List<Personal> personals = personalRepository.findAll();
        if (personals.isEmpty()) {
            throw new RuntimeException("No hay Personal disponible");
        }
        return personals;
    }
}


