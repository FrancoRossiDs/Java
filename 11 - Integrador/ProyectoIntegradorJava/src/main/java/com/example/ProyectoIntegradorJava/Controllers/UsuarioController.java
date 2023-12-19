package com.example.ProyectoIntegradorJava.Controllers;

import com.example.ProyectoIntegradorJava.Modules.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    private CarritoCompra carrito = new CarritoCompra();

    @GetMapping("/productos")
    public String mostrarProductos(Model model) {
        Producto producto1 = new Ropa("Camiseta", "Nike", 5000, "img", true);
        Producto producto2 = new Ropa("Teléfono", "Samsung", 250000, "img", true);
        Producto producto3 = new Ropa("Chocolate", "Hershey's", 5000, "img", true);

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        // Crear una lista de productos para mostrar en la vista
        List<Producto> productos = new ArrayList<>(carrito.getItems().stream()
                .filter(Producto.class::isInstance)
                .map(Producto.class::cast)
                .collect(Collectors.toList()));

        model.addAttribute("productos", productos);
        model.addAttribute("carrito", carrito);

        return "productos";
    }


    @GetMapping("/carrito")
    public String verCarrito(Model model){
        if (carrito == null) {
            carrito = new CarritoCompra();
        }
        model.addAttribute("carrito", carrito);
        model.addAttribute("productos", carrito.getItems()); // Agregar la lista de productos al modelo
        return "carrito";
    }


    @PostMapping("/realizarCompra")
    public String realizarCompra(Model model) {
        double total = carrito.calcularTotal();
        model.addAttribute("total", total);

        carrito.vaciarCarrito();

        return "redirect:/usuario/productos";
    }

}
