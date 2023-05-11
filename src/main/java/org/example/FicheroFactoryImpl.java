package org.example;

public class FicheroFactoryImpl implements FicheroFactory{
    @Override
    public Componente crearFichero(String nombre, int tamano) {
        return new Fichero(nombre, tamano);
    }
}
