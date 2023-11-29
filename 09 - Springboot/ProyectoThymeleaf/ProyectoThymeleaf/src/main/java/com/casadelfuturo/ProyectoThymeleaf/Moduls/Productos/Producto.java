package com.casadelfuturo.ProyectoThymeleaf.Moduls.Productos;

public class Producto {
    private String nombre;
    private  String marca;
    private  double precio;
    private  String img;
    private int stock;
    private boolean disponibilidad;

    public Producto(String nombre, String marca, double precio, String img, int stock,boolean disponibilidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.img = img;
        this.stock = stock;
        this.disponibilidad=disponibilidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
