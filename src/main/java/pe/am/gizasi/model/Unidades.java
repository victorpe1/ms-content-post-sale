package pe.am.gizasi.model;


import jakarta.persistence.*;

@Entity
@Table(name = "unidades")
public class Unidades {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_unidad;
  private String nombre;

  public int getId_unidad() {
    return id_unidad;
  }

  public void setId_unidad(int id_unidad) {
    this.id_unidad = id_unidad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
