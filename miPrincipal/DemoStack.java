package miPrincipal;
import java.util.Stack;
public class DemoStack {
    public static void menu() {
        System.out.println("****************");
        System.out.println("      STACK     ");
        System.out.println("****************");
        System.err.println();
       //Crea una nueva pila de Enteros
        Stack<Integer> pila = new Stack<Integer>();
        //Apilamos algunos enteros
        pila.push(2);
        pila.push(6);
        pila.push(7);
        pila.push(10);
        System.out.println("El tope de la pila es: "+pila.peek());
        //Buscamos un elemento
        int pos=pila.search(6);
        System.out.println("Posicion del elemento buscado = "+pos);
        
        //Desapilamos elementos
        pila.pop();
        System.out.println("El tope de la pila es: "+pila.peek());
        pila.pop();
        System.out.println("El tope de la pila es: "+pila.peek());
        pila.pop();
        System.out.println("El tope de la pila es: "+pila.peek());


    }
    
    
    
    
}
