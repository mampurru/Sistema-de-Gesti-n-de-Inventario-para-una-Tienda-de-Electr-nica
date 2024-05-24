import java.util.List;

public class Informe {
    public void generarInformeDeVentas(List<Venta> ventas) {
        System.out.println("Informe de Ventas:");
        for (Venta venta : ventas) {
            System.out.println("ID Venta: " + venta.getIdVenta() + " - Total: $" + venta.getTotalVenta() + " - Fecha: " + venta.getFechaHora());
        }
    }

    public void generarInformeDeInventario(List<Producto> productos) {
        System.out.println("Informe de Inventario:");
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId() + " - Nombre: " + producto.getNombre() + " - Stock: " + producto.getCantidadEnStock());
        }
    }
}
