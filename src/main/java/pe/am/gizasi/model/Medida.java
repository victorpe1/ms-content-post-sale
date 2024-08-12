package pe.am.gizasi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "medidas")
public class Medida {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_medida")
  private int idMedida;

  @Column(name = "nombre", nullable = false, length = 25)
  private String nombre;

  @Column(name = "factor_medida")
  private Float factorMedida;

  @Column(name = "id_unidad")
  private Short idUnidad;

  @Column(name = "factor_conversion")
  private Float factorConversion;

  @Column(name = "nume_orde")
  private Integer numeOrde;

  private String codigo;

  private String medSunat;

  // Getters and Setters


  public int getIdMedida() {
    return idMedida;
  }

  public void setIdMedida(int idMedida) {
    this.idMedida = idMedida;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Float getFactorMedida() {
    return factorMedida;
  }

  public void setFactorMedida(Float factorMedida) {
    this.factorMedida = factorMedida;
  }

  public Short getIdUnidad() {
    return idUnidad;
  }

  public void setIdUnidad(Short idUnidad) {
    this.idUnidad = idUnidad;
  }

  public Float getFactorConversion() {
    return factorConversion;
  }

  public void setFactorConversion(Float factorConversion) {
    this.factorConversion = factorConversion;
  }

  public Integer getNumeOrde() {
    return numeOrde;
  }

  public void setNumeOrde(Integer numeOrde) {
    this.numeOrde = numeOrde;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getMedSunat() {
    return medSunat;
  }

  public void setMedSunat(String medSunat) {
    this.medSunat = medSunat;
  }
}
