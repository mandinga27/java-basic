public class PruebaCaja {

    public static void main(String[] args) {

        Caja objeto = new Caja();
        objeto.a = 3;
        objeto.b = 2;
        objeto.c = 6;

        System.out.println("\nResultado calculo volumen: " + objeto.CalcularVolumen());

        Caja objeto2 = new Caja(6, 4, 12);
        System.out.println("\nResultado objeto2: " + objeto2.CalcularVolumen());
    }
}
