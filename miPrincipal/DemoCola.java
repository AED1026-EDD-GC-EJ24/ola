package miPrincipal;

public class DemoCola {
    public static void menu() {
        System.out.println("****************");
        System.out.println("      COLA      ");
        System.out.println("****************");
        System.err.println();
        //Crear una nueva cola de Entero
        Cola<Integer> cola = new Cola<Integer>();
        //Encolar algunos elementos
        cola.encolar(12);
        cola.encolar(13);
        cola.encolar(14);
        cola.encolar(15);
        //
        System.out.println("el primer elemento de la cola: "
           +cola.frente().toString());

        cola.desencolar();
        System.out.println("el primer elemento de la cola: "
           +cola.frente().toString());
        
        cola.desencolar();
        System.out.println("el primer elemento de la cola: "
              +cola.frente().toString());

        cola.desencolar();
        System.out.println("el primer elemento de la cola: "
              +cola.frente().toString());
        cola.desencolar();
        System.out.println("el primer elemento de la cola: "
            +cola.frente());



    }
    
}
