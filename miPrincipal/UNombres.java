package miPrincipal;
import java.util.Collection;
import java.util.Vector;



public class UNombres {
    public static Collection<String> obtenerlista(){
        //instanciar un Vector especializado en String
        Vector<String> v = new Vector<String>();
        //agregar elementos al vector
        v.add("Pablo");
        v.add("Juan");
        v.add("Pedro");
        
        return v;

    }
    
    
}
