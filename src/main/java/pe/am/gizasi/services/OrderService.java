package pe.am.gizasi.services;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.am.gizasi.dto.OrderDetalle;
import pe.am.gizasi.dto.OrderRequest;
import pe.am.gizasi.model.OrdenPedido;
import pe.am.gizasi.model.OrdenPedidoDetalle;
import pe.am.gizasi.repository.OrderDetailRepository;
import pe.am.gizasi.repository.OrderRepository;
import pe.am.gizasi.util.DateUtil;
import pe.am.gizasi.util.OrderRequestTimeException;

import java.time.LocalTime;
import java.util.Date;

@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;
  @Autowired
  private OrderDetailRepository orderDetailRepository;

  public String saveOrderPedido(OrderRequest ordenPedido) {

    /*LocalTime now = LocalTime.now();
    LocalTime start = LocalTime.of(5, 0); // 5AM
    LocalTime end = LocalTime.of(19, 0); // 7PM

    if (now.isBefore(start) || now.isAfter(end)) {
      throw new OrderRequestTimeException("La solicitud no puede ser atendida fuera del horario permitido (5AM a 7PM).");
    }
    */

    String maxIdNumero = orderRepository.findMaxIdNumero();
    String newIdNumero = generateNewIdNumero(maxIdNumero);

    OrdenPedido orderPedido = new OrdenPedido();
    orderPedido.setIdNumero(newIdNumero);
    orderPedido.setFecha(new Date()); // Fecha actual como fecha de creación
    orderPedido.setFechaDeVenc(DateUtil.parseStringToDate(ordenPedido.getFechaDeVenc())); //arreglar error
    orderPedido.setFechaDeEntrega(DateUtil.parseStringToDate(ordenPedido.getFechaDeEntrega()));
    orderPedido.setIdCliente(ordenPedido.getIdCliente());
    orderPedido.setDireccion(ordenPedido.getDirecc());
    orderPedido.setIdCond(ordenPedido.getIdCond());
    orderPedido.setIdVendedor(ordenPedido.getIdVendedor());
    orderPedido.setIdCobrador(ordenPedido.getIdVendedor()); //idVendedor
    orderPedido.setIdAlmacen(ordenPedido.getIdAlmacen());
    orderPedido.setMoneda(ordenPedido.getMoneda());
    orderPedido.setTipoDeCambio(ordenPedido.getTipoDeCambio());
    orderPedido.setSubtotal(ordenPedido.getSubtotal());
    orderPedido.setDescuento(ordenPedido.getDescuento());
    orderPedido.setTotal(ordenPedido.getTotal());
    orderPedido.setIdUsuario(ordenPedido.getIdUsuario());
    orderPedido.setEstado(ordenPedido.getEstado());
    orderPedido.setIdDistrito(ordenPedido.getIdDistrito());
    orderPedido.setCodUbigeo(ordenPedido.getCodUbigeo());

    orderRepository.save(orderPedido);

    for (OrderDetalle orderDetalle : ordenPedido.getOrderDetalle()) {
      OrdenPedidoDetalle ordenPedidoDetalle = new OrdenPedidoDetalle();
      ordenPedidoDetalle.setIdNumero(newIdNumero);
      ordenPedidoDetalle.setIdProducto(orderDetalle.getIdProducto());
      ordenPedidoDetalle.setMoneda(orderDetalle.getMoneda());
      ordenPedidoDetalle.setTipoDeCambio(orderDetalle.getTipoDeCambio());
      ordenPedidoDetalle.setPrecioUnit(orderDetalle.getPrecioUnit());
      ordenPedidoDetalle.setCantidad(orderDetalle.getCantidad());
      ordenPedidoDetalle.setMonto(orderDetalle.getMonto());
      ordenPedidoDetalle.setPrecioUnitAlTipCam(orderDetalle.getPrecioUnitAlTipCam());
      ordenPedidoDetalle.setMontoAlTipCam(orderDetalle.getMonto()); //genero
      ordenPedidoDetalle.setIdMedida(orderDetalle.getIdMedida());
      ordenPedidoDetalle.setCantidad2(orderDetalle.getPeso());

      orderDetailRepository.save(ordenPedidoDetalle);
    }

    return newIdNumero;
  }

  private String generateNewIdNumero(String currentMaxIdNumero) {
    if (currentMaxIdNumero == null) {
      return "0000000001";
    }
    int nextId = Integer.parseInt(currentMaxIdNumero) + 1;
    return String.format("%010d", nextId);
  }
}
