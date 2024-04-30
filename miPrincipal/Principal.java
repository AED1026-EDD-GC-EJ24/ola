package miPrincipal;
import java.util.Scanner;
public class Principal{  
    public static void main(String[] args) throws PosicionIlegalException  {
        
        Scanner consola = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("***********************");
            System.err.println("  Estructuras Lineales ");
            System.out.println("***********************");
            System.out.println(" 1)  Pila");
            System.out.println(" 2)  Stack");
            System.out.println(" 3)  Delimitadores");
            System.out.println(" 4)  Expresion Infija a PostFija");
            System.out.println(" 5)  Cola");
            System.out.println(" 6)  DemoQueue");
            System.out.println(" 7)  Tablas de Dispersion");
            System.out.println(" 8)  Estructura Combinada");
            System.out.println(" 9)  Lista simplemente enlazada");
            System.out.println(" 10) LinkedList y ArrayList");
            System.out.println(" 11) ArrayList de Personas");
            System.out.println(" 12) LinkedList de Cuadrúpedos");
            System.out.println(" 13) Lista de Contactos");
            System.out.println(" 14) Lista Doblemente Enlazada");
            System.out.println(" 15) Lista Circular");

            System.out.println();

            System.out.println("0) Salir");
            System.out.print("Selecciona opción:");
            opc = consola.nextInt();
            switch (opc) {
                case 1:
                    DemoPila.menu();
                    break;

                case 2:
                    DemoStack.menu();
                    break;
                case 3:
                   DemoDelimitador.menu();
                   break;
                case 4:
                case 5:
                   DemoCola.menu();
                   break;
                case 6:
                   DemoQueue.menu();
                   break;
                case 7:
                   DemoTablaDispersion.menu();
                   break;
                case 8:
                   DemoEstCombinada.menu();
                   break;
                case 9:
                     DemoListaSimple.menu();
                     break;
                case 10:
                    DemoLinkedListyArrayList.menu();
                    break;
                case 11:
                    DemoArrayListPersonas2.menu();
                    break;
                case 12:
                    DemoLinkedListCuadrupedos2.menu();
                    break;
                case 13:
                    DemoListaContactos.menu();
                    break;
                case 14:
                    DemoListaDoble.menu();
                    break;
                case 15:
                    DemoListaCircular.menu();
                    break;
    
                case 0:
                    System.out.println("ADIOS!");
                    consola.close();
                    break;
                default:
                    System.out.println("Valor incorrecto, intente de nuevo");
                    break;
            }

        }while (opc !=0);
    }

    

}