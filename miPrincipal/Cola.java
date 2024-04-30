package miPrincipal;

public class Cola <T> {
    //Atributo cabeza, que apunta al primer elementos de la cola
    private Nodo<T> cabeza;
    //Atributo cola, que apunta al último elemento de la cola
    private Nodo<T> cola;
    //Alacena el total de elementos de la cola
    private int tamanio;
    //Constructores
    public Cola(){
        cabeza = null;
        cola = null;
        tamanio = 0;
    }
    public int getTamanio(){
        return tamanio;
    }
    public boolean esVacia(){
        return (cabeza == null);
    }
    public void encolar(T valor){
        //Crear un nuevo Nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor detro de Nodo
        nuevo.setValor(valor);
        if (esVacia()){
            // cabeza y cola apuntan al nuevo nodo
            cabeza = nuevo;
            cola = nuevo;

        }else{
            //se enlaza el campo siguiente de cola con el nuevo
            //elemento
            cola.setSiguiente(nuevo);
            //la nueva cola pasa a ser el nuevo;
            cola = nuevo;
        }
        //incrementa el tamanio porque hay un nuevo elemento en la cola
        tamanio++;
    }
    public void desencolar(){
        //si no esta vacia
        if (!esVacia()){
            //verificar si hay un solo element en la cola
            if(cabeza == cola){
                cabeza = null;
                cola = null;

            }else{
                //se elimina el primer elemento de la cola
                //desplazando la cabeza a siguiente
                cabeza = cabeza.getSiguiente();
            }
            //se disminuye el total de elementos
            tamanio--;
        }
    }
    //Devueldel el primer elemento de la cola
    public T frente(){
        if (!esVacia())
           return cabeza.getValor();
        else
           return null;
    }

    
}
