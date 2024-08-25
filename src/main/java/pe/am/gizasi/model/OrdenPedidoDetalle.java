package pe.am.gizasi.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ordpeddeta")
@IdClass(OrderDetalleId.class)
public class OrdenPedidoDetalle {

  @Id
  @Column(name = "id_numero", length = 10, nullable = false)
  private String idNumero;

  @Id
  @Column(name = "id_producto", nullable = false)
  private Integer idProducto;

  @Column(name = "moneda", length = 1, nullable = false)
  private String moneda;

  @Column(name = "tipodecambio", nullable = false, precision = 6, scale = 3)
  private BigDecimal tipoDeCambio;

  @Column(name = "preciounit", nullable = false, precision = 12, scale = 3)
  private BigDecimal precioUnit;

  @Column(name = "cantidad", nullable = false, precision = 12, scale = 3)
  private BigDecimal cantidad;

  @Column(name = "monto", nullable = false, precision = 12, scale = 2)
  private BigDecimal monto;

  @Column(name = "preciounitaltipcam", precision = 12, scale = 3)
  private BigDecimal precioUnitAlTipCam;

  @Column(name = "montoaltipcam", precision = 12, scale = 2)
  private BigDecimal montoAlTipCam;

  @Column(name = "pcomi", precision = 6, scale = 2)
  private BigDecimal pcomi;

  @Column(name = "comi", precision = 12, scale = 2)
  private BigDecimal comi;

  @Column(name = "mone_cost", length = 1)
  private String moneCost;

  @Column(name = "costo", precision = 12, scale = 2)
  private BigDecimal costo;

  @Column(name = "cantidad_promocion", precision = 9, scale = 3)
  private BigDecimal cantidadPromocion;

  @Column(name = "flag_promocion")
  private Boolean flagPromocion;

  @Column(name = "cantidad2", precision = 12, scale = 3)
  private BigDecimal cantidad2;

  @Column(name = "id_medida")
  private Integer idMedida;

  @Column(name = "tipotributo")
  private String tipotributo;

  @Column(name = "bonificacion")
  private String bonificacion;

  @Column(name = "precunitgrat")
  private BigDecimal precunitgrat;

  @Column(name = "montograt")
  private BigDecimal montograt;


  public String getTipotributo() {
    return tipotributo;
  }

  public void setTipotributo(String tipotributo) {
    this.tipotributo = tipotributo;
  }

  public String getBonificacion() {
    return bonificacion;
  }

  public void setBonificacion(String bonificacion) {
    this.bonificacion = bonificacion;
  }

  public BigDecimal getPrecunitgrat() {
    return precunitgrat;
  }

  public void setPrecunitgrat(BigDecimal precunitgrat) {
    this.precunitgrat = precunitgrat;
  }

  public BigDecimal getMontograt() {
    return montograt;
  }

  public void setMontograt(BigDecimal montograt) {
    this.montograt = montograt;
  }

  public String getIdNumero() {
    return idNumero;
  }

  public void setIdNumero(String idNumero) {
    this.idNumero = idNumero;
  }

  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
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

  public BigDecimal getPrecioUnit() {
    return precioUnit;
  }

  public void setPrecioUnit(BigDecimal precioUnit) {
    this.precioUnit = precioUnit;
  }

  public BigDecimal getCantidad() {
    return cantidad;
  }

  public void setCantidad(BigDecimal cantidad) {
    this.cantidad = cantidad;
  }

  public BigDecimal getMonto() {
    return monto;
  }

  public void setMonto(BigDecimal monto) {
    this.monto = monto;
  }

  public BigDecimal getPrecioUnitAlTipCam() {
    return precioUnitAlTipCam;
  }

  public void setPrecioUnitAlTipCam(BigDecimal precioUnitAlTipCam) {
    this.precioUnitAlTipCam = precioUnitAlTipCam;
  }

  public BigDecimal getMontoAlTipCam() {
    return montoAlTipCam;
  }

  public void setMontoAlTipCam(BigDecimal montoAlTipCam) {
    this.montoAlTipCam = montoAlTipCam;
  }

  public BigDecimal getPcomi() {
    return pcomi;
  }

  public void setPcomi(BigDecimal pcomi) {
    this.pcomi = pcomi;
  }

  public BigDecimal getComi() {
    return comi;
  }

  public void setComi(BigDecimal comi) {
    this.comi = comi;
  }

  public String getMoneCost() {
    return moneCost;
  }

  public void setMoneCost(String moneCost) {
    this.moneCost = moneCost;
  }

  public BigDecimal getCosto() {
    return costo;
  }

  public void setCosto(BigDecimal costo) {
    this.costo = costo;
  }

  public BigDecimal getCantidadPromocion() {
    return cantidadPromocion;
  }

  public void setCantidadPromocion(BigDecimal cantidadPromocion) {
    this.cantidadPromocion = cantidadPromocion;
  }

  public Boolean getFlagPromocion() {
    return flagPromocion;
  }

  public void setFlagPromocion(Boolean flagPromocion) {
    this.flagPromocion = flagPromocion;
  }

  public BigDecimal getCantidad2() {
    return cantidad2;
  }

  public void setCantidad2(BigDecimal cantidad2) {
    this.cantidad2 = cantidad2;
  }

  public Integer getIdMedida() {
    return idMedida;
  }

  public void setIdMedida(Integer idMedida) {
    this.idMedida = idMedida;
  }
}
