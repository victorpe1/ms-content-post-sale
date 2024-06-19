package pe.am.gizasi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tcambio")
public class Tcambio {

    @Id
    private LocalDateTime fecha;

    private BigDecimal libre;

    private BigDecimal compra;

    private BigDecimal venta;

    // Constructor por defecto
    public Tcambio() {
    }

    // Getters y Setters
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getLibre() {
        return libre;
    }

    public void setLibre(BigDecimal libre) {
        this.libre = libre;
    }

    public BigDecimal getCompra() {
        return compra;
    }

    public void setCompra(BigDecimal compra) {
        this.compra = compra;
    }

    public BigDecimal getVenta() {
        return venta;
    }

    public void setVenta(BigDecimal venta) {
        this.venta = venta;
    }

}

