public class Caja {

    int a;
    int b;
    int c;

    //constructor vacio
    Caja(){

    }

    //constructor con parametros
    Caja(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int CalcularVolumen(){
        return a * b * c;
    }
}
