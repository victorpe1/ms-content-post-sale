package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.OrdenPedidoDetalle;


@Repository
public interface OrderDetailRepository extends JpaRepository<OrdenPedidoDetalle, String> {
}
