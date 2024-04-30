package miPrincipal;

public class DemoListaSimple {
    
    public static void menu() throws PosicionIlegalException {
        System.out.println("****************");
        System.out.println("  Lista Simple  ");
        System.out.println("****************");
        System.err.println();
        Lista<Integer> lista = new Lista<Integer>();
        //Agrega tres elementos
        lista.agregar(12); //0
        lista.agregar(15); //1
        lista.agregar(20); //2
        //Imprimir los datos agregados
        System.out.println("Dato en la posicion 0: "+lista.getValor(0));
        System.out.println("Dato en la posicion 1: "+lista.getValor(1));
        System.out.println("Dato en la posicion 2: "+lista.getValor(2));
        //Insertar un 13 en la posicion 1:
        lista.insertar(13, 1);
        //Insertar el 16 en la posicion 3
        lista.insertar(16,3);
        //Imprimo los datos agregados 
        System.out.println("Con los nuevos elementos agregados");
        System.out.println("Dato en la posicion 0: "+lista.getValor(0));
        System.out.println("Dato en la posicion 1: "+lista.getValor(1));
        System.out.println("Dato en la posicion 2: "+lista.getValor(2));
        System.out.println("Dato en la posicion 3: "+lista.getValor(3));
        System.out.println("Dato en la posicion 4: "+lista.getValor(4));
        //Insertar un elemento el la poscion 6;
        //lista.insertar(17,6);
        //Eliminar la posicion 0
        lista.remover(0);
        //Eliminar la posicion 3
        lista.remover(3);
        System.out.println("Muestro elementos después de la eliminacion");
        System.out.println("Dato en la posicion 0: "+lista.getValor(0));
        System.out.println("Dato en la posicion 1: "+lista.getValor(1));
        System.out.println("Dato en la posicion 2: "+lista.getValor(2));


    }
}
