package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.OrdenPedido;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrdenPedido, String> {
  @Query("SELECT MAX(o.idNumero) FROM OrdenPedido o")
  String findMaxIdNumero();

  @Query(value = "SELECT * FROM ordped o WHERE CAST(o.fecha AS DATE) = ?", nativeQuery = true)
  List<OrdenPedido> findByFecha(@Param("fecha") String fecha);

}

