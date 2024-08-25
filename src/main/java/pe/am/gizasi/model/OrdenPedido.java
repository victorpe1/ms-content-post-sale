package pe.am.gizasi.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordped")
public class OrdenPedido {

  @Id
  @Column(name = "id_numero", length = 10, nullable = false)
  private String idNumero;

  @Column(name = "fecha", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date fecha;

  @Column(name = "fechadevenc")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaDeVenc;

  @Column(name = "fechadeentrega")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaDeEntrega;

  @Column(name = "id_cliente", nullable = false)
  private Integer idCliente;

  @Column(name = "direcc", length = 100, nullable = false)
  private String direccion;

  @Column(name = "id_cond", nullable = false)
  private Integer idCond;

  @Column(name = "id_vendedor", nullable = false)
  private Integer idVendedor;

  @Column(name = "id_cobrador", nullable = false)
  private Integer idCobrador;

  @Column(name = "id_transportista")
  private Integer idTransportista;

  @Column(name = "id_almacen", nullable = false)
  private Integer idAlmacen;

  @Column(name = "moneda", length = 1, nullable = false)
  private String moneda;

  @Column(name = "tipodecambio", nullable = false, precision = 6, scale = 3)
  private BigDecimal tipoDeCambio;

  @Column(name = "subtotal", nullable = false, precision = 12, scale = 2)
  private BigDecimal subtotal;

  @Column(name = "descuento", nullable = false, precision = 12, scale = 2)
  private BigDecimal descuento;

  @Column(name = "total", nullable = false, precision = 12, scale = 2)
  private BigDecimal total;

  @Column(name = "subtotalaltipcam", precision = 12, scale = 2)
  private BigDecimal subtotalAlTipCam;

  @Column(name = "descuentoaltipcam", precision = 12, scale = 2)
  private BigDecimal descuentoAlTipCam;

  @Column(name = "totalaltipcam", precision = 12, scale = 2)
  private BigDecimal totalAlTipCam;

  @Column(name = "id_usuario", nullable = false)
  private Integer idUsuario;

  @Column(name = "estado", length = 1, nullable = false)
  private String estado;

  @Column(name = "comi", precision = 12, scale = 2)
  private BigDecimal comi;

  @Column(name = "id_precioxzona")
  private Integer idPrecioxZona;

  @Column(name = "facturado", length = 1)
  private String facturado;

  @Column(name = "factura", length = 10)
  private String factura;

  @Column(name = "id_num_alt", length = 10)
  private String idNumAlt;

  @Column(name = "id_distrito")
  private Integer idDistrito;

  @Column(name = "email", length = 100)
  private String email;

  @Column(name = "codubigeo", length = 6)
  private String codUbigeo;

  @Column(name = "ordcom", length = 10)
  private String ordCom;

  @Column(name = "id_motirech")
  private Integer idMotirech;

  @Column(name = "id_ruta")
  private Integer idRuta;

  @Column(name = "id_coordinador")
  private Integer idCoordinador;

  @Column(name = "obs")
  private String observacion;

  @Column(name = "total_opgratuito")
  private BigDecimal total_opgratuito;

  @Column(name = "total_opexonerado")
  private BigDecimal total_opexonerado;

  @Transient
  private List<OrdenPedidoDetalle> ordenPedidoDetalleList;

  public List<OrdenPedidoDetalle> getOrdenPedidoDetalleList() {
    return ordenPedidoDetalleList;
  }

  public void setOrdenPedidoDetalleList(List<OrdenPedidoDetalle> ordenPedidoDetalleList) {
    this.ordenPedidoDetalleList = ordenPedidoDetalleList;
  }

  public BigDecimal getTotal_opexonerado() {
    return total_opexonerado;
  }

  public void setTotal_opexonerado(BigDecimal total_opexonerado) {
    this.total_opexonerado = total_opexonerado;
  }

  public BigDecimal getTotal_opgratuito() {
    return total_opgratuito;
  }

  public void setTotal_opgratuito(BigDecimal total_opgratuito) {
    this.total_opgratuito = total_opgratuito;
  }

  public String getObservacion() {
    return observacion;
  }

  public void setObservacion(String observacion) {
    this.observacion = observacion;
  }

  public String getIdNumero() {
    return idNumero;
  }

  public void setIdNumero(String idNumero) {
    this.idNumero = idNumero;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public Date getFechaDeVenc() {
    return fechaDeVenc;
  }

  public void setFechaDeVenc(Date fechaDeVenc) {
    this.fechaDeVenc = fechaDeVenc;
  }

  public Date getFechaDeEntrega() {
    return fechaDeEntrega;
  }

  public void setFechaDeEntrega(Date fechaDeEntrega) {
    this.fechaDeEntrega = fechaDeEntrega;
  }

  public Integer getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Integer idCliente) {
    this.idCliente = idCliente;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Integer getIdCond() {
    return idCond;
  }

  public void setIdCond(Integer idCond) {
    this.idCond = idCond;
  }

  public Integer getIdVendedor() {
    return idVendedor;
  }

  public void setIdVendedor(Integer idVendedor) {
    this.idVendedor = idVendedor;
  }

  public Integer getIdCobrador() {
    return idCobrador;
  }

  public void setIdCobrador(Integer idCobrador) {
    this.idCobrador = idCobrador;
  }

  public Integer getIdTransportista() {
    return idTransportista;
  }

  public void setIdTransportista(Integer idTransportista) {
    this.idTransportista = idTransportista;
  }

  public Integer getIdAlmacen() {
    return idAlmacen;
  }

  public void setIdAlmacen(Integer idAlmacen) {
    this.idAlmacen = idAlmacen;
  }

  public String getMoneda() {
    return moneda;
  }

  public void setMoneda(String moneda) {
    this.moneda = moneda;
  }

  public BigDecimal getTipoDeCambio() {
    return tipoDeCambio;
  }

  public void setTipoDeCambio(BigDecimal tipoDeCambio) {
    this.tipoDeCambio = tipoDeCambio;
  }

  public BigDecimal getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  public BigDecimal getDescuento() {
    return descuento;
  }

  public void setDescuento(BigDecimal descuento) {
    this.descuento = descuento;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public BigDecimal getSubtotalAlTipCam() {
    return subtotalAlTipCam;
  }

  public void setSubtotalAlTipCam(BigDecimal subtotalAlTipCam) {
    this.subtotalAlTipCam = subtotalAlTipCam;
  }

  public BigDecimal getDescuentoAlTipCam() {
    return descuentoAlTipCam;
  }

  public void setDescuentoAlTipCam(BigDecimal descuentoAlTipCam) {
    this.descuentoAlTipCam = descuentoAlTipCam;
  }

  public BigDecimal getTotalAlTipCam() {
    return totalAlTipCam;
  }

  public void setTotalAlTipCam(BigDecimal totalAlTipCam) {
    this.totalAlTipCam = totalAlTipCam;
  }

  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public BigDecimal getComi() {
    return comi;
  }

  public void setComi(BigDecimal comi) {
    this.comi = comi;
  }

  public Integer getIdPrecioxZona() {
    return idPrecioxZona;
  }

  public void setIdPrecioxZona(Integer idPrecioxZona) {
    this.idPrecioxZona = idPrecioxZona;
  }

  public String getFacturado() {
    return facturado;
  }

  public void setFacturado(String facturado) {
    this.facturado = facturado;
  }

  public String getFactura() {
    return factura;
  }

  public void setFactura(String factura) {
    this.factura = factura;
  }

  public String getIdNumAlt() {
    return idNumAlt;
  }

  public void setIdNumAlt(String idNumAlt) {
    this.idNumAlt = idNumAlt;
  }

  public Integer getIdDistrito() {
    return idDistrito;
  }

  public void setIdDistrito(Integer idDistrito) {
    this.idDistrito = idDistrito;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCodUbigeo() {
    return codUbigeo;
  }

  public void setCodUbigeo(String codUbigeo) {
    this.codUbigeo = codUbigeo;
  }

  public String getOrdCom() {
    return ordCom;
  }

  public void setOrdCom(String ordCom) {
    this.ordCom = ordCom;
  }

  public Integer getIdMotirech() {
    return idMotirech;
  }

  public void setIdMotirech(Integer idMotirech) {
    this.idMotirech = idMotirech;
  }

  public Integer getIdRuta() {
    return idRuta;
  }

  public void setIdRuta(Integer idRuta) {
    this.idRuta = idRuta;
  }

  public Integer getIdCoordinador() {
    return idCoordinador;
  }

  public void setIdCoordinador(Integer idCoordinador) {
    this.idCoordinador = idCoordinador;
  }
}
