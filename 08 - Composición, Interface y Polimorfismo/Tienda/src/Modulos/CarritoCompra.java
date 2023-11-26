package Modulos;
import Clientes.Cliente;
import Clientes.clientePremium;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private final List<Vendible> productos;
    private final Scanner scanner;
    private final Cliente cliente;

    public CarritoCompra(Scanner scanner, Cliente cliente) {
        this.scanner = scanner;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void iniciarCompra() {
        while (true) {
            System.out.println("¿Qué producto deseas agregar al carrito? (Electrodomesticos/Ropa/Verduras/Salir): ");
            String tipoProducto = scanner.nextLine().toLowerCase();

            if (tipoProducto.equals("salir")) {
                break;
            }

            System.out.println("Ingrese el nombre del producto: ");
            String nombre = capitalizarPrimeraLetra(scanner.nextLine());

            System.out.println("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.println("Ingrese la cantidad de unidades: ");
            int unidades = scanner.nextInt();

            scanner.nextLine();

            Vendible producto;

            switch (tipoProducto) {
                case "electrodomesticos":
                    producto = crearElectrodomestico(nombre, precio, unidades);
                    break;

                case "ropa":
                    producto = crearRopa(nombre, precio, unidades);
                    break;

                case "verduras":
                    producto = crearVerduras(nombre, precio, unidades);
                    break;

                default:
                    System.out.println("Tipo de producto no reconocido. Por favor, inténtalo de nuevo.");
                    continue;
            }

            agregarProducto(producto);
        }
    }

    public void agregarProducto(Vendible producto) {
        productos.add(producto);
        System.out.println(producto.getNombre() + " agregado al carrito.");
    }

    public void imprimirCarrito() {
        System.out.println("Contenido del carrito:");
        for (Vendible producto : productos) {
            System.out.println("- " + producto.getNombre());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Vendible producto : productos) {
            total += producto.calcularPrecio();
        }

        // Lógica adicional para aplicar descuentos, si el cliente es premium
        if (cliente instanceof clientePremium) {
            total *= 0.9;  // Descuento del 10% para clientes premium
            System.out.println("Descuento aplicado para Cliente Premium");
        }

        return total;
    }

    private String capitalizarPrimeraLetra(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    private Electrodomesticos crearElectrodomestico(String nombre, double precio, int unidades) {
        System.out.println("Ingrese la marca de la lavadora: ");
        String marca = capitalizarPrimeraLetra(scanner.nextLine());
        System.out.println("Ingrese el consumo de la lavadora: ");
        double consumo = scanner.nextDouble();
        System.out.println("Ingrese el año de fabricación de la lavadora: ");
        int anio = scanner.nextInt();
        return new Electrodomesticos(nombre, precio, unidades, marca, consumo, anio);
    }

    private Ropa crearRopa(String nombre, double precio, int unidades) {
        System.out.println("Ingrese el material de la ropa: ");
        String material = capitalizarPrimeraLetra(scanner.nextLine());
        System.out.println("Ingrese la marca de la ropa: ");
        String marcaRopa = capitalizarPrimeraLetra(scanner.nextLine());
        System.out.println("Ingrese el diseñador de la ropa: ");
        String disenador = capitalizarPrimeraLetra(scanner.nextLine());
        return new Ropa(nombre, precio, unidades, material, marcaRopa, disenador);
    }

    private Verduras crearVerduras(String nombre, double precio, int unidades) {
        System.out.println("Ingrese la cantidad de calorías de las verduras: ");
        int calorias = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        System.out.println("Ingrese la granja de origen de las verduras: ");
        String granja = capitalizarPrimeraLetra(scanner.nextLine());
        // Corregir la llamada al constructor de Verduras
        return new Verduras(nombre, precio, unidades, calorias, 0, granja);
    }
}
