package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Distrito;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Integer> {

}
