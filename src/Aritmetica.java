
public class Aritmetica {
    //atributos de la clase
    int a;  //variable de la clase -> global
    int b;
    int c;

    //constructor vacio
    Aritmetica(){

    }

    //constructor con dos argumentos
    public Aritmetica(int a, int b){ //args variables locales
        this.a = a; //acceder a la variable sin el atributo ej int
        this.b = b; //y ademas queda como variable local utilizando el mismo nonbre
        this.c = c;
    }

    //este metodo sumar toma los atributos de la clase
    int sumar(){
        return (a + b);
    }

    int restar() {
        return a - b;
    }

    int multiplicar() {
        return a * b;
    }

    int dividir() {
        return a / b;
    }

    int volumen() {
        return a * b * c;
    }
}
