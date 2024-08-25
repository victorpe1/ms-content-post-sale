package pe.am.gizasi.dto;

import jakarta.persistence.Column;

import java.math.BigDecimal;

public class OrderDetalle {
  private String idNumero;
  private int idProducto;
  private String moneda;
  private BigDecimal tipoDeCambio;
  private BigDecimal precioUnit;
  private BigDecimal cantidad;
  private BigDecimal peso;
  private BigDecimal monto;
  private BigDecimal precioUnitAlTipCam;
  private int idMedida;
  private String tipotributo;
  private String bonificacion;
  private BigDecimal precunitgrat;
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

  public BigDecimal getPeso() {
    return peso;
  }

  public void setPeso(BigDecimal peso) {
    this.peso = peso;
  }

  public int getIdMedida() {
    return idMedida;
  }

  public void setIdMedida(int idMedida) {
    this.idMedida = idMedida;
  }

  public String getIdNumero() {
    return idNumero;
  }

  public void setIdNumero(String idNumero) {
    this.idNumero = idNumero;
  }

  public int getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(int idProducto) {
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
}
