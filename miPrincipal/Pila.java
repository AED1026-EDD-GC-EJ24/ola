package miPrincipal;
public class Pila<T>{
    //Atributo cabeza, que apunta al tope la pila
    private Nodo<T> cabeza;
    //Almacena el total de elementos de la pil
    private int tamanio;
    //constructor
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //Devueve el total de elementos de la pila
    public int getTamanio(){
        return tamanio;
    }
    //Verificar si la pila esta vacia
    public boolean esVacia(){
        return (cabeza==null);
    }
    //Apila un elemento nuevo
    public void apilar(T valor){
        //Crear un nuevo Nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if (esVacia()){
            //cabeza apunta al nodo nuevo
            cabeza = nuevo;
        }else {
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //Incremento el tamaño porque hay un nuevo Nodo
        tamanio++;
    }
    //Elimina un elemento de la pila
    public void retirar(){
        if(!esVacia()){
           cabeza = cabeza.getSiguiente();
           tamanio--;
        }
    }
    //Devuelve el elementos almacenado en el TOPE de la pila
    public T cima(){
        if (!esVacia())
            return cabeza.getValor();
        
        else
           return null;
    }
}