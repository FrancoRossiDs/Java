package Clientes;

import Modulos.Producto;
import Modulos.Vendible;

public class clientePremium implements Cliente{
    @Override
    public void realizarCompra(Vendible producto) {
        double precio= producto.calcularPrecio();
        System.out.println("Cliente Premium realizó compra por $"+ precio);

    }
}
