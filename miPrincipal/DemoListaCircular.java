package miPrincipal;
import listaCircular.ListaCircular;;

public class DemoListaCircular {
    public static void menu() throws PosicionIlegalException {
        System.out.println("*****************");
        System.out.println("  Lista Circular  ");
        System.out.println("*****************");
        System.err.println();
        ListaCircular<Integer> lc = new ListaCircular<Integer>();
        lc.agregar(10);
        lc.agregar(20);
        lc.agregar(30);
        System.out.println("Lista después de la agregación");
        for(int i=0;i<lc.getTamanio();i++){
            System.out.println("Elemento "+i+":"+lc.getValor(i));
        }
        lc.insertar(50, 1);
        System.out.println("Lista después de la insercion");
        for(int i=0;i<lc.getTamanio();i++){
            System.out.println("Elemento "+i+":"+lc.getValor(i));
        }
        lc.remover(0);
        System.out.println("Lista después de la eliminacion");
        for(int i=0;i<lc.getTamanio();i++){
            System.out.println("Elemento "+i+":"+lc.getValor(i));
        }
        
        lc.remover(2);
       
        System.out.println("Lista después de la eliminacion");
        for(int i=0;i<lc.getTamanio();i++){
            System.out.println("Elemento "+i+":"+lc.getValor(i));
        }


    }
    
    
}
