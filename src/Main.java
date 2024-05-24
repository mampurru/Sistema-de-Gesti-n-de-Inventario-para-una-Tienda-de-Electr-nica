//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<>();
        List<Venta> ventas = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Creación de usuarios de ejemplo
        usuarios.add(new Usuario("admin", "admin123", "Administrador"));
        usuarios.add(new Usuario("vendedor1", "vend123", "Vendedor"));
        usuarios.add(new Usuario("gerente1", "gerente123", "Gerente"));

        boolean salir = false;

        while (!salir) {
            System.out.println("Menú Principal");
            System.out.println("1. Login");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Implementación del login y lógica de roles
                    System.out.print("Usuario: ");
                    String usuario = scanner.next();
                    System.out.print("Contraseña: ");
                    String contraseña = scanner.next();

                    Usuario usuarioActual = null;
                    for (Usuario u : usuarios) {
                        if (u.getNombreDeUsuario().equals(usuario) && u.verificarContraseña(contraseña)) {
                            usuarioActual = u;
                            break;
                        }
                    }

                    if (usuarioActual == null) {
                        System.out.println("Usuario o contraseña incorrectos.");
                        break;
                    }

                    if (usuarioActual.getRol().equals("Administrador")) {
                        menuAdministrador(scanner, inventario, ventas, usuarios);
                    } else if (usuarioActual.getRol().equals("Vendedor")) {
                        menuVendedor(scanner, inventario, ventas);
                    } else if (usuarioActual.getRol().equals("Gerente")) {
                        menuGerente(scanner, inventario, ventas);
                    }
                    break;

                case 2:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    public static void menuAdministrador(Scanner scanner, List<Producto> inventario, List<Venta> ventas, List<Usuario> usuarios) {

        System.out.println("Menú Administrador");

    }

    public static void menuVendedor(Scanner scanner, List<Producto> inventario, List<Venta> ventas) {

        System.out.println("Menú Vendedor");

    }

    public static void menuGerente(Scanner scanner, List<Producto> inventario, List<Venta> ventas) {

        System.out.println("Menú Gerente");

    }
}
