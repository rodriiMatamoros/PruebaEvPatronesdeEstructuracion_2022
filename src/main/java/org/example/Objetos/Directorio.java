package org.example.Objetos;

import java.util.ArrayList;
import java.util.List;
public class Directorio implements Componente {
    private String nombre;
    private List<Componente> componentes;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamano() {
        int total = 0;
        for (Componente componente : componentes) {
            total += componente.getTamano();
        }
        return total;
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }
}
