import javax.print.attribute.standard.PresentationDirection;

public class Persona {

    //atributos de la clase
    //no es necesario asignar valores
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int resultado;

    //agregar metodos de la clase
    //los usaran los objetos de esta clase
    public void desplegarNombre() { //void no retorna ningun valor
        System.out.println("******  Clase Persona   *****");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apellidoPaterno);
        System.out.println("Apellido Materno: " + apellidoMaterno);
        System.out.println("*****************************" + "\n");
    }

    /* estructura metodo
    class NombreClase {
        tipo nombreMetodo(lista_de_argumentos) {
            //cuerpo del metodo

        }
    }
     */
    int sumar(int a, int b){
        //realiza la suma y retorna el resultado
        int resultado = a + b;
        System.out.println("Resultado suma: " + resultado);
        return  resultado;
    }

    public void desplegarSuma() { //void no retorna ningun valor
        System.out.println("******  Clase Persona   *****");
        System.out.println("Suma: " + resultado);
        System.out.println("*****************************" + "\n");
    }

    //forma gral de un constructor
    //los constructorres no retornan nada
    /*
    NombreClase(){
        //cuerpo del constructor
        //constructor con dos argumentos
        Aritmetica(int arg1, int arg2){
            //cuerpo del constructor
        }
    }

     */
}
