package org.example.Factorias;

import org.example.Objetos.Componente;
import org.example.Objetos.Fichero;
import org.example.Objetos.Link;

public class LinkFactoryImpl implements FicheroFactory {
    @Override
    public Componente crearFichero(String nombre, int tamano) {
        Componente componenteReferencia = new Fichero("FicheroReferencia", tamano);
        return new Link(nombre, componenteReferencia);
    }
}
