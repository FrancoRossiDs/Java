package com.example.ProyectoIntegradorJava.Controllers;

import com.example.ProyectoIntegradorJava.Modules.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    private CarritoCompra carrito = new CarritoCompra();

    @GetMapping("/productos")
    public String mostrarProductos(Model model) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Ropa("Camiseta", "Nike", 5000, "img", true));
        productos.add(new Ropa("Teléfono", "Samsung", 250000, "img", true));
        productos.add(new Ropa("Chocolate", "Hershey's", 5000, "img", true));

        carrito.agregarProductos(productos);
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
        return "carrito";
    }


    @PostMapping("realizarCompra")
    public String realizarCompra(){
        carrito.vaciarCarrito();
        return "redirect:/usuario/carrito";  // Cambiado de /productos a /carrito
    }
}
