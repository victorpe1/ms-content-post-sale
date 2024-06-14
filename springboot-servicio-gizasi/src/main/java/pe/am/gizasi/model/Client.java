package pe.am.gizasi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Client {
    @Id
    @Column(name="id_Cliente")
    private Integer idCliente;
    private String nombre;
    private String representante;
    private String domicilio;
    @Column(name="id_distrito")
    private Integer idDistrito;
    private Integer local;
    private String ocupacion;
    private String telefonos;
    private String fax;
    private String ruc;
    private String dni;
    private String moneda;
    @Column(name="id_tienda")
    private Integer idTienda;
    @Column(name="id_vendedor")
    private Integer idVendedor;
    @Column(name="id_cobrador")
    private Integer idCobrador;
    private int activo;
    private String direcc1;
    private String direcc2;
    private String direcc3;
    private String direcc4;
    @Column(name="id_distrito_direcc1")
    private Integer idDistritoDirecc1;
    @Column(name="id_distrito_direcc2")
    private Integer idDistritoDirecc2;
    @Column(name="id_distrito_direcc3")
    private Integer idDistritoDirecc3;
    @Column(name="id_distrito_direcc4")
    private Integer idDistritoDirecc4;
    private String email;
    private String telefono2;
    private String telefono3;
    private String telefono4;
    private String codUbigeo;
    private String email1;
    private String email2;
    private String email3;
    private String email4;
    private String codUbigeo1;
    private String codUbigeo2;
    private String codUbigeo3;
    private String codUbigeo4;
    private String nacionalidad;
    @Column(name="carnet_extranjeria")
    private String carnetExtranjeria;

    // Constructor vacío
    public Client() {
    }

    // Getters y Setters
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Integer getLocal() {
        return local;
    }

    public void setLocal(Integer local) {
        this.local = local;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Integer idTienda) {
        this.idTienda = idTienda;
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

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getDirecc1() {
        return direcc1;
    }

    public void setDirecc1(String direcc1) {
        this.direcc1 = direcc1;
    }

    public String getDirecc2() {
        return direcc2;
    }

    public void setDirecc2(String direcc2) {
        this.direcc2 = direcc2;
    }

    public String getDirecc3() {
        return direcc3;
    }

    public void setDirecc3(String direcc3) {
        this.direcc3 = direcc3;
    }

    public String getDirecc4() {
        return direcc4;
    }

    public void setDirecc4(String direcc4) {
        this.direcc4 = direcc4;
    }

    public Integer getIdDistritoDirecc1() {
        return idDistritoDirecc1;
    }

    public void setIdDistritoDirecc1(Integer idDistritoDirecc1) {
        this.idDistritoDirecc1 = idDistritoDirecc1;
    }

    public Integer getIdDistritoDirecc2() {
        return idDistritoDirecc2;
    }

    public void setIdDistritoDirecc2(Integer idDistritoDirecc2) {
        this.idDistritoDirecc2 = idDistritoDirecc2;
    }

    public Integer getIdDistritoDirecc3() {
        return idDistritoDirecc3;
    }

    public void setIdDistritoDirecc3(Integer idDistritoDirecc3) {
        this.idDistritoDirecc3 = idDistritoDirecc3;
    }

    public Integer getIdDistritoDirecc4() {
        return idDistritoDirecc4;
    }

    public void setIdDistritoDirecc4(Integer idDistritoDirecc4) {
        this.idDistritoDirecc4 = idDistritoDirecc4;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public String getTelefono4() {
        return telefono4;
    }

    public void setTelefono4(String telefono4) {
        this.telefono4 = telefono4;
    }

    public String getCodUbigeo() {
        return codUbigeo;
    }

    public void setCodUbigeo(String codUbigeo) {
        this.codUbigeo = codUbigeo;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public String getEmail4() {
        return email4;
    }

    public void setEmail4(String email4) {
        this.email4 = email4;
    }

    public String getCodUbigeo1() {
        return codUbigeo1;
    }

    public void setCodUbigeo1(String codUbigeo1) {
        this.codUbigeo1 = codUbigeo1;
    }

    public String getCodUbigeo2() {
        return codUbigeo2;
    }

    public void setCodUbigeo2(String codUbigeo2) {
        this.codUbigeo2 = codUbigeo2;
    }

    public String getCodUbigeo3() {
        return codUbigeo3;
    }

    public void setCodUbigeo3(String codUbigeo3) {
        this.codUbigeo3 = codUbigeo3;
    }

    public String getCodUbigeo4() {
        return codUbigeo4;
    }

    public void setCodUbigeo4(String codUbigeo4) {
        this.codUbigeo4 = codUbigeo4;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCarnetExtranjeria() {
        return carnetExtranjeria;
    }

    public void setCarnetExtranjeria(String carnetExtranjeria) {
        this.carnetExtranjeria = carnetExtranjeria;
    }
}

