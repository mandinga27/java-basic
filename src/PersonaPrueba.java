public class PersonaPrueba {

    public static void main(String[] args) {

        //creacion de un objeto
        Persona p1 = new Persona(); //constructor vacio
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        p1.nombre = "Abraham";
        p1.apellidoPaterno = "Musa";
        p1.apellidoMaterno = "Navarro";
        p1.desplegarNombre();

        //creacion nuevo objeto
        p2.nombre = "Felipe";
        p2.apellidoPaterno = "Tapia";
        p2.apellidoMaterno = "Garrido";
        p2.desplegarNombre();

        //creamos otro objeto
        int resultado = p3.sumar(215,5);
        //p3.desplegarSuma();

    }
}
