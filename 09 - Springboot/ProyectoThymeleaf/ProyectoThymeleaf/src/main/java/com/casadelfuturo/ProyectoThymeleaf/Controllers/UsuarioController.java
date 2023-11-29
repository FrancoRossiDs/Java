package com.casadelfuturo.ProyectoThymeleaf.Controllers;

import com.casadelfuturo.ProyectoThymeleaf.Moduls.Productos.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class UsuarioController {
    @GetMapping("")
    //GET - POST - PUT - CLEAR
    public String usuario(Model model){
        String saludo="Hola mundo";
        int numUno=15;
        int numDos=25;
        Date fecha=new Date();
        List<Producto>productos=new ArrayList<>();
        productos.add(new Producto("Manzana", "Granja Sol", 200.0, "https://w7.pngwing.com/pngs/14/397/png-transparent-apple-fruit-green-apple-red-apple.png", 100, true));
        productos.add(new Producto("Laptop", "Nvidia", 900000, "https://www.nvidia.com/content/dam/en-zz/Solutions/geforce/ces/gaming-laptops/geforce-rtx-30-series-laptops-shop-630-d@2x.png",10, false));
        productos.add(new Producto("Remera", "Mufanti", 40000,"https://d3ugyf2ht6aenh.cloudfront.net/stores/001/719/894/products/remera_lisa_fucsia1-e627a1e03939757ad316252543648786-640-0.png",50, false));
        productos.add(new Producto("Lavarropas", "Longvie", 525.929,"https://medias.musimundo.com/medias/00521009-135240-135240-01-135240-01.jpg-size515?context=bWFzdGVyfGltYWdlc3w2OTEwMHxpbWFnZS9qcGVnfGg1YS9oOGQvMTA0NDkzOTEwNTg5NzQvMDA1MjEwMDktMTM1MjQwLTEzNTI0MF8wMS0xMzUyNDBfMDEuanBnX3NpemU1MTV8NzdiNTUyMzc3MzkzMjQ1ZTUwMjYxYmI0YWJjYzNiZmNlOWFmNDA3MmU4ODFhNmZhMDNkODI5NjYzZDY2ZjJiNA",5, false));
        productos.add(new Producto("Pure de Tomate", "Campagnola", 950.0, "https://http2.mlstatic.com/D_NQ_NP_636328-MLA44964183781_022021-O.webp", 50, true));

        model.addAttribute("fecha", fecha);
        model.addAttribute("numUno",numUno);
        model.addAttribute("numDos",numDos);
        model.addAttribute("saludo",saludo);
        model.addAttribute("productos",productos);

        return "index";//Busca archivo en la carpeta templates (en esta caso index.html)
    }

}
