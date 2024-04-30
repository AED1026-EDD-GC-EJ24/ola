package miPrincipal;
/* 
Se  introduzcan 10000 cuadrúpedos en una lista de tipo estático List y
 tipo dinámico LinkedLis. 
El atributo tipo debe establecerse para cada objeto de forma aleatoria. 
A continuación, el programa debe mostrar por consola los datos de los objetos
 con idCuadrupedo múltiplo de 1000 y mostrar un resumen de cuántos cuadrúpedos hay de cada tipo.
 y finalmente mostrar mediante un iterados la lista de todos los cuadrúpedos
 creados aleatoriamente
*/
import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import java.util.Iterator;
import cuadrupedo.Cuadrupedo;

public class DemoLinkedListCuadrupedos2 {
    public static void menu(){
        System.out.println("************************");
        System.out.println("       LinkedList       ");
        System.out.println("       Cuadrúpedos      ");
        System.out.println("************************");
        System.out.println();
        try{
            List<Cuadrupedo> cuadrupedos = new LinkedList<>();
            String[] tipos={"León","Gato","Perro","Elefante"};
            Random random = new Random();
            for(int i=1;i<=10000;i++){
                String tipo = tipos[random.nextInt(tipos.length)];
                cuadrupedos.add(new Cuadrupedo(i, tipo));
            }
            int leonCount=0, gatoCount=0,perroCount=0, elefanteCount=0;
            for(Cuadrupedo cuadrupedo: cuadrupedos){
                if(cuadrupedo.getIdCuadrupedo() %1000 ==0){
                    System.out.println("ID"+cuadrupedo.getIdCuadrupedo()+
                    ", Tipo: "+cuadrupedo.getTipo());
                }
                switch (cuadrupedo.getTipo()) {
                    case "León":
                        leonCount++;
                        break;
                    case "Gato":
                        gatoCount++;
                        break;
                    case "Perro":
                        perroCount++;
                        break;
                    case "Elefante":
                        elefanteCount++;
                        break;
                }

            }
            System.out.println("Resumen:");
            System.out.println("Leones: " + leonCount);
            System.out.println("Gatos: " + gatoCount);
            System.out.println("Perros: " + perroCount);
            System.out.println("Elefantes: " + elefanteCount);

            System.out.println("Muestra la lista de todos lo cuadrúpedos creados:");
            Cuadrupedo temp = null;
            Iterator<Cuadrupedo> it = cuadrupedos.iterator();
            while(it.hasNext()){
                temp = it.next();
                System.out.println(temp);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
            
        }
    }

    

