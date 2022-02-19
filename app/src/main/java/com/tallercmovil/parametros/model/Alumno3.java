package com.tallercmovil.parametros.model;

import java.io.Serializable;

public class Alumno3 implements Serializable {
    String nombre;
    String numCuenta;

    public Alumno3(String nombre, String numCuenta) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
