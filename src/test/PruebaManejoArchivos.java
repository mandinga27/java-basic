package test;

import static manejoarchivos.ManejoArchivos.*;

public class PruebaManejoArchivos {
    public static void main(String[] args) {

        String nombreArchivo = "test.txt";
        //crearArchivo(nombreArchivo);
        String saludo = "Hola desde Angular\nHola desde C\n";
        String saludo2 = "Hola desde React";

        anexarArchivo(nombreArchivo, saludo);
        anexarArchivo(nombreArchivo, saludo2);

        //metodo que leer el archivo de la clase MnejoArchivos
        leerArchivo(nombreArchivo);
    }
}
