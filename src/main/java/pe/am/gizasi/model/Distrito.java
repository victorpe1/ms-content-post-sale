package pe.am.gizasi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "distrito")
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_distrito;
    private String nombre;
    private Integer id_provincia;
    private Integer cont_distsunat;
    private String codubigeo;

    public Distrito() {
    }

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(Integer id_provincia) {
        this.id_provincia = id_provincia;
    }

    public Integer getCont_distsunat() {
        return cont_distsunat;
    }

    public void setCont_distsunat(Integer cont_distsunat) {
        this.cont_distsunat = cont_distsunat;
    }

    public String getCodubigeo() {
        return codubigeo;
    }

    public void setCodubigeo(String codubigeo) {
        this.codubigeo = codubigeo;
    }


}

