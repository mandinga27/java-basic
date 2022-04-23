package test;

import static manejoarchivos.ManejoArchivos.anexarArchivo;
import static manejoarchivos.ManejoArchivos.escribirArchivo;

public class PruebaManejoArchivos {
    public static void main(String[] args) {

        String nombreArchivo = "test.txt";
        //crearArchivo(nombreArchivo);
        String saludo = "Hola desde Java\nHola desde Python\n";
        String saludo2 = "Te veo en la próxima escritura";

        anexarArchivo(nombreArchivo, saludo);
        anexarArchivo(nombreArchivo, saludo2);
    }
}
