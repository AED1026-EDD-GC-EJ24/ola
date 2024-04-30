package miPrincipal;
/*
 * En código crea un ArrayList lp que es nuestro objeto con la lista de Personas. 
 * Procedemos con una carga bastante pesada como pueden ser 1.000 objetos de la clase Persona. 
 * Una vez cargadas hemos hecho un recorrido sobre esta y
 *  calculamos finalmente la media de altura de las Personas
 *  que se ha generado aleatoriamente entre 100 cm de altura y 200 cm.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import personas.Persona;
import java.util.Iterator;

public class DemoArrayListPersonas2 {
    public static void menu(){
        System.out.println("************************");
        System.out.println("       ArrayList        ");
        System.out.println("       Personas         ");
        System.out.println("************************");
        System.out.println();
        try{
            List<Persona> lp = new ArrayList<Persona>();
            Random r = new Random();
            Persona temp = null;
            int sumaaltura=0;
            for(int i=0;i<1000;i++){
                lp.add(new Persona(i,"Persona"+i,r.nextInt(100)+100));
            }
            Iterator<Persona> it = lp.iterator();
            while(it.hasNext()){
                temp = it.next();
                System.out.println(temp);
                sumaaltura+=temp.getAltura();
            }
            System.out.println("La media de altura del conjunto de Personas es:"+
                   sumaaltura/lp.size());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
