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

    /*para este metodo necesita:
     * ruta archivo
     * nombre archivo
     * Parametros: nombreArchivo viene de la Clase PruebaManejoArchivos, contiene el nombre de test.txt
     * metodo leer con while, mientras encuentre un espacio en blanco el file -> null -> termino cilco
     * imprimir resultado
     * retorna: N/A
     */
    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader( new FileReader(archivo));//la clase leer lineas completas del archiv caracter por caracter
            var lectura = entrada.readLine(); //la clase readLine lee todo el contenido del archivo
            while (lectura != null) { //al leer linea en blanco termina el ciclo
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine(); //aca se almacena el contenido de la lectura
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

}
