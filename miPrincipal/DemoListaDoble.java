package miPrincipal;
import listaDoble.ListaDoblementeEnlazada;
public class DemoListaDoble {
    public static void menu() throws PosicionIlegalException  {
        System.out.println("****************");
        System.out.println("  Lista Doble  ");
        System.out.println("****************");
        System.err.println();
        ListaDoblementeEnlazada<Integer> listadoble = new ListaDoblementeEnlazada<Integer>();
        listadoble.agregar(10);
        listadoble.agregar(20);
        listadoble.agregar(30);
        System.out.println(listadoble.getValor(0));
        System.out.println(listadoble.getValor(1));
        System.out.println(listadoble.getValor(2));
        System.out.println("Mostrar los elementos después de agregar");
        System.out.println("Elemento 0:"+listadoble.getValor(0));
        System.out.println("Elemento 1:"+listadoble.getValor(1));
        System.out.println("Elemento 2:"+listadoble.getValor(2));
        for(int i=0;i<listadoble.getTamanio();i++){
            System.out.println("Elemento "+i+":"+listadoble.getValor(i));
        }
        listadoble.insertar(50, 1);

        System.out.println("Elementos depues de la inserción");

        for(int i=0;i<listadoble.getTamanio();i++){
            System.out.println("Elemento "+i+":"+listadoble.getValor(i));
        }

        listadoble.remover(0);
        System.out.println("Elementos depues de la eliminacion");

        for(int i=0;i<listadoble.getTamanio();i++){
            System.out.println("Elemento "+i+":"+listadoble.getValor(i));
        }

        
    }

    
}
