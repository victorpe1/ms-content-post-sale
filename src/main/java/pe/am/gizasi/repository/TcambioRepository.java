package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Tcambio;
import java.time.LocalDateTime;

@Repository
public interface TcambioRepository extends JpaRepository<Tcambio, LocalDateTime> {

}
