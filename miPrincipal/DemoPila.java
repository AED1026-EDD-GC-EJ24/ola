package miPrincipal;

public class DemoPila {
    public static void menu() {
        System.out.println("****************");
        System.out.println("      PILA      ");
        System.out.println("****************");
        System.err.println();
         //Crear una nueva pila de enteros
         Pila<Integer> pila = new Pila<Integer>();
         //Apilar algunos elementos
         pila.apilar(2);
         pila.apilar(5);
         pila.apilar(7);
         System.out.println("El tope de la pila es:"+pila.cima());
         //Desapila
         pila.retirar();
         System.out.println("El tope de la pila es:"+pila.cima());
         pila.retirar();
         System.out.println("El tope de la pila es:"+pila.cima());
         pila.retirar();
         System.out.println("El tope de la pila es:"+pila.cima());
       
    }
    
}
