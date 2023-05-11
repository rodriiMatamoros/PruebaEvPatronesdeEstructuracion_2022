package org.example;

public class Fichero implements Componente {
    private String nombre;
    private int tamano;

    public Fichero(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamano() {
        return tamano;
    }
}
