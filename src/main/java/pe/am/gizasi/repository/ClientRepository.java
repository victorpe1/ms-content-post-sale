package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
