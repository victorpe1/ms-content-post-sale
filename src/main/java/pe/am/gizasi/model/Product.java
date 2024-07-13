package pe.am.gizasi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    private String nombre;
    private Integer facuni;
    private Integer id_medida;
    private short id_unidad;
    private char moneda;
    private Integer kardex;
    private Integer series;
    private Float stockmin;
    private Float stockmax;
    private char prevtaigv;
    private BigDecimal preciovtamen;
    private BigDecimal preciovtamay;
    private Character mone_cost;
    private BigDecimal costo;
    private BigDecimal peso;
    private String codigo;
    private String unidad;
    private Integer id_marca;

    public Product() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFacuni() {
        return facuni;
    }

    public void setFacuni(int facuni) {
        this.facuni = facuni;
    }

    public int getId_medida() {
        return id_medida;
    }

    public void setId_medida(int id_medida) {
        this.id_medida = id_medida;
    }

    public short getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(short id_unidad) {
        this.id_unidad = id_unidad;
    }

    public char getMoneda() {
        return moneda;
    }

    public void setMoneda(char moneda) {
        this.moneda = moneda;
    }

    public int getKardex() {
        return kardex;
    }

    public void setKardex(int kardex) {
        this.kardex = kardex;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Float getStockmin() {
        return stockmin;
    }

    public void setStockmin(Float stockmin) {
        this.stockmin = stockmin;
    }

    public Float getStockmax() {
        return stockmax;
    }

    public void setStockmax(Float stockmax) {
        this.stockmax = stockmax;
    }

    public char getPrevtaigv() {
        return prevtaigv;
    }

    public void setPrevtaigv(char prevtaigv) {
        this.prevtaigv = prevtaigv;
    }

    public BigDecimal getPreciovtamen() {
        return preciovtamen;
    }

    public void setPreciovtamen(BigDecimal preciovtamen) {
        this.preciovtamen = preciovtamen;
    }

    public BigDecimal getPreciovtamay() {
        return preciovtamay;
    }

    public void setPreciovtamay(BigDecimal preciovtamay) {
        this.preciovtamay = preciovtamay;
    }

    public Character getMone_cost() {
        return mone_cost;
    }

    public void setMone_cost(Character mone_cost) {
        this.mone_cost = mone_cost;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Integer getId_marca() {
        return id_marca;
    }

    public void setId_marca(Integer id_marca) {
        this.id_marca = id_marca;
    }

}