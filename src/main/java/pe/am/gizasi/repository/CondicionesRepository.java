package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Condiciones;

@Repository
public interface CondicionesRepository extends JpaRepository<Condiciones, Integer> {
}

