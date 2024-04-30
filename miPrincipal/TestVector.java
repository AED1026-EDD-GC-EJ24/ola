package miPrincipal;
import java.util.Collection;

public class TestVector {
    public static void main(String[] args) {
        //el metodo obtenerLista retorna una coleccion de tipo Vector
        Collection<String> coll = UNombres.obtenerlista();
        //recorrer la coleccion
        for(String nom:coll){
            System.out.println(nom);
        }



    }
    
}
