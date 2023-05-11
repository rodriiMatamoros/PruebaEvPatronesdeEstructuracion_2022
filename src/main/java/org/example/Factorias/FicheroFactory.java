package org.example.Factorias;

import org.example.Objetos.Componente;

public interface FicheroFactory {
    Componente crearFichero(String nombre, int tamano);
}
