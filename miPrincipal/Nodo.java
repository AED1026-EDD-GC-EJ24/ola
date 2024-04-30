package miPrincipal;
public class Nodo<T>{
    //Atributos valor de tipo T. Almacena la referencia al objeto
    //que se guarda en el nodo
    private T valor;
    //Referencia al siguiente nodo enlazado
    Nodo<T> siguiente;
    //Constructor por defecto
    public Nodo(){
        valor = null;
        siguiente = null;
    }
    public T getValor(){
        return valor;
    }
    //regresa el valor
    public void setValor(T valor){
        this.valor = valor;
    }
    //Devuelde el atributo siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //Modifica el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente){
        this. siguiente = siguiente;
    }
     
}