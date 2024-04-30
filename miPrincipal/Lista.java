package miPrincipal;



public class Lista<T> {
    //primer elemento de la lista
    private Nodo<T> cabeza;
    //Total de elementos en la lista
    private int tamanio;
    //Constructor
    public Lista(){
        cabeza = null;
        tamanio = 0;
    }
    //devuelve el tamanio de la lista
    public int getTamanio() {
        return tamanio;
    }
    //Consulta si la lista esta vacia
    public boolean esVacia(){
        if (cabeza == null) 
            return true;
        else
            return false;
        
    }
    //Agregar un nuevo nodo al final de la lista
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if(esVacia()){
            cabeza = nuevo;
        }else{
            //Crea un nuevo nodo y lo coloca al final de la lista
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;

    }
    //Insertar un nuevo elemento en la lista
    public void insertar(T valor, int pos) throws 
       PosicionIlegalException{
        if (pos>=0 && pos<=tamanio){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            if(pos == 0){
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            }else{
                //el nodo se inserta al final de la lista
                if(pos==tamanio){
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                }
                aux.setSiguiente(nuevo);
            }
            //el nodo se inserta en medio de la lista
            else{

                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos-2; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo<T> siguiente = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
            }
        }
        tamanio++;

        }else{
            throw new PosicionIlegalException();
        }
        
    } 
    //Devuelve el valor de un nodo en una posicion dada
    public T getValor(int pos) throws PosicionIlegalException{
        if (pos>=0 && pos<tamanio){
            T valor;
            if (pos == 0){
                valor = cabeza.getValor();  
                return valor;
            }
            else{
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos-1; i++) {
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();
                return valor;
            }

        }
        else{
            throw new PosicionIlegalException();
        }   
    }
    public void remover(int pos) throws PosicionIlegalException{
        if (pos>=0 && pos<tamanio){
           if (pos==0) {
            //Elimina el primer nodo de la lista
            cabeza = cabeza.getSiguiente();
            tamanio--;
           }
           else{ //el último o en medio
            Nodo<T> aux = cabeza;
            for (int i = 0; i <= pos-2; i++) {
                aux = aux.getSiguiente();
            }
            Nodo<T> prox = aux.getSiguiente();
            aux.setSiguiente(prox.getSiguiente());
            tamanio--;

           }
        }
        else{
            throw new PosicionIlegalException();
        }
    }
    //Elimina toda la lista
    public void limpiar(){
        cabeza = null;
        tamanio = 0;
    }
    
}
