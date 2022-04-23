package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Archivo creado con exito");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Archivo escrito con exito");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Archivo escrito con exito");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void leerSrchivo(String nombreArchivo) {
        /*para este metodo necesita:
        * ruta archivo
        * nombre archivo
        * metodo leer
        * imprimir resultado
         */
    }

}
