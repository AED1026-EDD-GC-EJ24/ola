package miPrincipal;
import java.util.Queue; //Interface
import java.util.LinkedList;

/*
 * Queue es na interface, por lo que requiere instancias como
 * un objeto en concreto: se puede elegir una de las implementaciones 
 * de la API Collections de java: java.util.LikedList o
 *                                java.util.PriorityQueue;
 * LinkedList es una cola estándar y 
 * PriorityQueue: es una cola con prioridades que almacena elementos
 *          internos de acuerdo a un orden
 * add() inserta un elemento en la cola
 * remove() devuelve y remueve el primer elemento de la cola
 * peek() devuelve el primer elemento de la cola y devuelve null cuando
 *        la cola esta vacia
 */
public class DemoQueue {
    public static void menu(){
        System.out.println("****************");
        System.out.println("     QUEUE      ");
        System.out.println("****************");
        System.err.println();

        //Crea una cola generica
        Queue<String> micola = new LinkedList<String>();
        //Agregar elementos a la cola en ese orden
        micola.add("elemento 0");
        micola.add("elemento 1");
        micola.add("elemento 2");
        //Muestra el primer elemento de la cola
        System.out.println("El primer elemento de la cola es "+
                          micola.peek());
        //Eliminar el primer elemento de la cola
        micola.remove();

        //Muestra el primer elemento de la cola
        System.out.println("El primer elemento de la cola es "+
                          micola.peek());

        micola.remove();

        //Muestra el primer elemento de la cola
        System.out.println("El primer elemento de la cola es "+
                          micola.peek());

        micola.remove();

        //Muestra el primer elemento de la cola
        System.out.println("El primer elemento de la cola es "+
                          micola.peek());





    }
    
}
