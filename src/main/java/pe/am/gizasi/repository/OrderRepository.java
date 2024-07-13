package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.OrdenPedido;

@Repository
public interface OrderRepository extends JpaRepository<OrdenPedido, String> {
  @Query("SELECT MAX(o.idNumero) FROM OrdenPedido o")
  String findMaxIdNumero();

}

