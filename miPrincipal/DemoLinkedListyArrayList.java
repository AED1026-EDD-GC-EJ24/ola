package miPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

import java.util.Iterator;


public class DemoLinkedListyArrayList {
    public static void menu(){
        System.out.println("************************");
        System.out.println("       LinkedList       ");
        System.out.println("       ArrayList        ");
        System.out.println("************************");
        System.out.println();
        try{
            List<Integer> lista = new LinkedList<Integer>();
            List<Integer> lista2 = new ArrayList<Integer>();
            lista.add(12);
            lista.add(15);
            lista.add(20);
            System.out.println("Dato en la posicion 0:"+lista.get(0));
            System.out.println("Dato en la posicion 1:"+lista.get(1));
            System.out.println("Dato en la posicion 2:"+lista.get(2));
            lista.add(1,13);
            lista.add(3,16);
            System.out.println("Datos después de la inserción:");
            System.out.println("Dato en la posicion 0:"+lista.get(0));
            System.out.println("Dato en la posicion 1:"+lista.get(1));
            System.out.println("Dato en la posicion 2:"+lista.get(2));
            System.out.println("Dato en la posicion 3:"+lista.get(3));
            System.out.println("Dato en la posicion 4:"+lista.get(4));
            lista.remove(0);
            lista.remove(3);
            System.out.println("Después de la eliminación");
            System.out.println("Dato en la posicion 0:"+lista.get(0));
            System.out.println("Dato en la posicion 1:"+lista.get(1));
            System.out.println("Dato en la posicion 2:"+lista.get(2));
            //System.out.println("Dato en la posicion 3:"+lista.get(3));
            
            lista2.add(10);
            lista2.add(15);
            lista2.add(24);
            System.out.println("Elementos agragados al ArrayList:");
            System.out.println("Dato en la posicion 0:"+lista2.get(0));
            System.out.println("Dato en la posicion 1:"+lista2.get(1));
            System.out.println("Dato en la posicion 2:"+lista2.get(2));
            lista2.add(0,18);
            lista2.add(3,21);
            System.out.println("Después de la Insercion:");
            System.out.println("Dato en la posicion 0:"+lista2.get(0));
            System.out.println("Dato en la posicion 1:"+lista2.get(1));
            System.out.println("Dato en la posicion 2:"+lista2.get(2));
            System.out.println("Dato en la posicion 3:"+lista2.get(3));
            System.out.println("Dato en la posicion 4:"+lista2.get(4));
            lista2.remove(0);
            lista2.remove(3);
            System.out.println("Datos después de la eliminación");
            System.out.println("Dato en la posicion 0:"+lista2.get(0));
            System.out.println("Dato en la posicion 1:"+lista2.get(1));
            System.out.println("Dato en la posicion 2:"+lista2.get(2));
            //Iterara lista2 para imprimir cada uno de sus elementos
            for(Integer aux:lista2){
                System.out.println("Elemento: "+aux);
            }
            System.out.println("Posicion del elemento 15:"+lista2.indexOf(15));
            lista2.set(0,100);
            System.out.println("El contenido del elemento 0:"+lista2.get(0));
            System.out.println("Tamaño de Lista2 es:"+lista2.size());

            System.out.println("Muestra la lista2 utilizando Iteradores:");

            Integer temp = null;
            Iterator<Integer> it = lista2.iterator();

            while(it.hasNext())
            {
                temp = it.next();
                System.out.println(temp);
            }



        }catch (Exception e){
            e.printStackTrace();

        }
    }
    
}
