package pe.am.gizasi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(nullable = false, unique = true)
    private String usuario;

    @Column
    private String nombre;

    @Column(nullable = false)
    private String clave;

    @Column(name = "fecha_ing", nullable = false)
    private Date fechaIng;

    @Column(name = "fecha_cese")
    private Date fechaCese;

    @Column(nullable = false)
    private Integer sexo;

    @Column
    private Integer tipo;

    @Column(nullable = false)
    private Integer activo;

    @Column(name = "sw_acceso_caja")
    private Integer swAccesoCaja;

    @Column(name = "clave_supadmin")
    private String claveSupadmin;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public Date getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(Date fechaCese) {
        this.fechaCese = fechaCese;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getSwAccesoCaja() {
        return swAccesoCaja;
    }

    public void setSwAccesoCaja(Integer swAccesoCaja) {
        this.swAccesoCaja = swAccesoCaja;
    }

    public String getClaveSupadmin() {
        return claveSupadmin;
    }

    public void setClaveSupadmin(String claveSupadmin) {
        this.claveSupadmin = claveSupadmin;
    }
}
