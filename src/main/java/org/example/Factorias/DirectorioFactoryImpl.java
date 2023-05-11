package org.example.Factorias;

import org.example.Objetos.Componente;
import org.example.Objetos.Directorio;

public class DirectorioFactoryImpl implements FicheroFactory {
    @Override
    public Componente crearFichero(String nombre, int tamano) {

        return new Directorio(nombre);
    }
}
