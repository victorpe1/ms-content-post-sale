package pe.am.gizasi.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_personal;
    private String nombre;
    private String domicilio;
    private Integer id_distrito;
    private String telefonos;
    private String dni;
    private String ruc;
    private BigDecimal pcomision;
    private Short id_ocupacion;
    private LocalDateTime fechanac;
    private int sexo;
    private Character estadocivil;
    private LocalDateTime fechainsc;
    private LocalDateTime fechacese;
    private int activo;
    private String abrev;
    private Character lugarcomi;
    private String lic_conducir;

    public Personal() {
    }

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(Integer id_distrito) {
        this.id_distrito = id_distrito;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public BigDecimal getPcomision() {
        return pcomision;
    }

    public void setPcomision(BigDecimal pcomision) {
        this.pcomision = pcomision;
    }

    public Short getId_ocupacion() {
        return id_ocupacion;
    }

    public void setId_ocupacion(Short id_ocupacion) {
        this.id_ocupacion = id_ocupacion;
    }

    public LocalDateTime getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDateTime fechanac) {
        this.fechanac = fechanac;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public Character getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(Character estadocivil) {
        this.estadocivil = estadocivil;
    }

    public LocalDateTime getFechainsc() {
        return fechainsc;
    }

    public void setFechainsc(LocalDateTime fechainsc) {
        this.fechainsc = fechainsc;
    }

    public LocalDateTime getFechacese() {
        return fechacese;
    }

    public void setFechacese(LocalDateTime fechacese) {
        this.fechacese = fechacese;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public Character getLugarcomi() {
        return lugarcomi;
    }

    public void setLugarcomi(Character lugarcomi) {
        this.lugarcomi = lugarcomi;
    }

    public String getLic_conducir() {
        return lic_conducir;
    }

    public void setLic_conducir(String lic_conducir) {
        this.lic_conducir = lic_conducir;
    }

}
