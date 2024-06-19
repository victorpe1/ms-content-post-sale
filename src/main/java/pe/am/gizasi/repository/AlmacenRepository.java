package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Almacen;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Integer> {
}
