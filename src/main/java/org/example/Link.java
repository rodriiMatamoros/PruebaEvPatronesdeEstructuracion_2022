package org.example;

public class Link implements Componente {
    private String nombre;
    private Componente componente;

    public Link (String nombre, Componente componente) {
        this.nombre = nombre;
        this.componente = componente;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamano() {
        return componente.getTamano();
    }

}
