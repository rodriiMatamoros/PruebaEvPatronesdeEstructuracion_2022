package org.example;

public class LinkFactoryImpl implements FicheroFactory{
    @Override
    public Componente crearFichero(String nombre, int tamano) {
        Componente componenteReferencia = new Fichero("FicheroReferencia", tamano);
        return new Link (nombre, componenteReferencia);
    }
}
