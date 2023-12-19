package com.example.ProyectoIntegradorJava.Modules;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private List<Vendible> items;

    public CarritoCompra() {
        this.items = new ArrayList<>();
    }

    public void agregarProducto(Vendible producto) {
        items.add(producto);
    }

    public void vaciarCarrito(){
        items.clear();
    }

    public List<Vendible> getItems(){
        return items;
    }

    public double calcularTotal(){
        double total=0;
        for (Vendible item:items){
            total+=item.calcularPrecio();
        }
        return total;
    }

    public void agregarProductos(List<? extends Vendible> productos) {
        items.addAll(productos);
    }
}


