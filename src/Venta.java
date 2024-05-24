import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idVenta;
    private List<Producto> productosVendidos;
    private double totalVenta;
    private LocalDateTime fechaHora;

    public Venta(int idVenta) {
        this.idVenta = idVenta;
        this.productosVendidos = new ArrayList<>();
        this.totalVenta = 0;
        this.fechaHora = LocalDateTime.now();
    }

    // Getters y setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public List<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(List<Producto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void agregarProducto(Producto producto) {
        productosVendidos.add(producto);
        calcularTotal();
    }

    public void calcularTotal() {
        totalVenta = 0;
        for (Producto producto : productosVendidos) {
            totalVenta += producto.getPrecio();
        }
    }
}
