package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
