package com.example.ProyectoIntegradorJava.Modules;

public class Producto {
    private String nombre;
    private String marca;
    private double precio;
    private boolean disponibilidad;
    private String img;

    public Producto(String nombre, String marca, double precio,String img, boolean disponibilidad){
        this.nombre=nombre;
        this.marca=marca;
        this.precio=precio;
        this.disponibilidad=disponibilidad;
        this.img=img;
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
