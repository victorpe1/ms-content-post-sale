package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.OrdenPedidoDetalle;

import java.util.List;


@Repository
public interface OrderDetailRepository extends JpaRepository<OrdenPedidoDetalle, String> {

  @Query("SELECT o FROM OrdenPedidoDetalle o WHERE o.idNumero = :idNumero")
  List<OrdenPedidoDetalle> findByIdNumero(@Param("idNumero") String idNumero);

}
