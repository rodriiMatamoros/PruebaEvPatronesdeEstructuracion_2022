package org.example.Factorias;

import org.example.Objetos.Componente;
import org.example.Objetos.Fichero;

public class FicheroFactoryImpl implements FicheroFactory{
    @Override
    public Componente crearFichero(String nombre, int tamano) {
        return new Fichero(nombre, tamano);
    }
}
