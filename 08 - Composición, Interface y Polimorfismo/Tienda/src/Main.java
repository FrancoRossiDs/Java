import Clientes.Cliente;
import Clientes.clientePremium;
import Clientes.clienteRegular;
import Modulos.Electrodomesticos;
import Modulos.Ropa;
import Modulos.Verduras;
import Modulos.CarritoCompra;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Modulos.Vendible;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda. ¿Eres cliente premium? (Sí/No): ");
        String esPremium = scanner.nextLine().toLowerCase();

        Cliente cliente;
        if (esPremium.equals("si")) {
            cliente = new clientePremium();
        } else {
            cliente = new clienteRegular();
        }

        CarritoCompra carrito = new CarritoCompra(scanner,cliente);
        carrito.iniciarCompra();

        // Imprimir el contenido del carrito
        carrito.imprimirCarrito();

        // Calcular el total
        double total = carrito.calcularTotal();
        System.out.println("Total de la compra: $" + total);

        System.out.println("Gracias por comprar con nosotros. ¡Hasta luego!");
    }
}