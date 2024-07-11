package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Unidades;


@Repository
public interface UnidadRepository extends JpaRepository<Unidades, Integer> {
}
