package org.example;

public class Main {
    public static void main() {
        // Crea las factorías
        FicheroFactory ficheroFactory = new FicheroFactoryImpl();
        FicheroFactory linkFactory = new LinkFactoryImpl();
        FicheroFactory directorioFactory = new DirectorioFactoryImpl();

        // Crea un fichero, un link y un directorio
        Componente fichero = ficheroFactory.crearFichero("Fichero1", 10);
        Componente link = linkFactory.crearFichero("Link1", 5); // Link1 tiene el tamaño del fichero de referencia
        Componente directorio = directorioFactory.crearFichero("Directorio1", 0); // El tamaño del directorio es 0 inicialmente

        // Imprime los nombres y tamaños
        System.out.println(fichero.getNombre() + ": " + fichero.getTamano());
        System.out.println(link.getNombre() + ": " + link.getTamano());
        System.out.println(directorio.getNombre() + ": " + directorio.getTamano());

        // Agrega el fichero y el link al directorio
        ((Directorio) directorio).agregarComponente(fichero);
        ((Directorio) directorio).agregarComponente(link);

        // Imprime el tamaño del directorio nuevamente (debería ser la suma de los tamaños del fichero y del link)
        System.out.println(directorio.getNombre() + ": " + directorio.getTamano());
    }
}