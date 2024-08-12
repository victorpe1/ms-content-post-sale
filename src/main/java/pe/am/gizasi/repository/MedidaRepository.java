package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Medida;

@Repository
public interface MedidaRepository extends JpaRepository<Medida, Integer> {
}
