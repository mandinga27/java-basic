public class PruebaAritmetica  {

    public static void main(String[] args) {

        //creamos un objeto de la clase Aritmetica
        Aritmetica objeto = new Aritmetica();
        objeto.a = 10;
        objeto.b = 32;
        int resultado = objeto.sumar();
        System.out.println("resultado = " + resultado);

        //creamos un segundo objeto de tipo Aritmetica
        Aritmetica objeto2 = new Aritmetica(23, 65);
        System.out.println("objeto2 = " + objeto2.sumar());

        //variables locales
        int operadorA = 6;
        int operadorB = 2;

        //creamos un objeto de la clase aritmetica
        Aritmetica objeto3 = new Aritmetica(operadorA, operadorB);

        //imprimiendo los valores de los operadores
        System.out.println("operadorA = " + operadorA);
        System.out.println("operadorB = " + operadorB);

        //imprimiendo resultado de la suma
        System.out.println("\nResultado de la suma: " + objeto3.sumar());

        //imrpimiendo resultado de la resta
        System.out.println("\nResultado de la resta: " + objeto3.restar());

        //imprimiendo resultado de la multiplicacion
        System.out.println("\nResultado de la multiplicacion: " + objeto3.multiplicar());

        //imprimiendo resultado de la division
        System.out.println("\nResultado de la division: " + objeto3.dividir());
    }
}
