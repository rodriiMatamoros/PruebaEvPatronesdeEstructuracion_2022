package org.example;

public class DirectorioFactoryImpl implements FicheroFactory {
    @Override
    public Componente crearFichero(String nombre, int tamano) {

        return new Directorio(nombre);
    }
}
