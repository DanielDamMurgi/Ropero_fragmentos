package com.example.equipo.ropero;

import java.io.Serializable;

/**
 * Created by Equipo on 13/01/2018.
 */

public class Ropa implements Serializable{

    private String nombre;
    private String descripcion;
    private double precio;
    private int foto;

    public Ropa(String nombre, String descripcion, double precio, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getFoto() {
        return foto;
    }
}
