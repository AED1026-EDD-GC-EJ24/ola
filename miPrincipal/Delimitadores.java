package miPrincipal;

public class Delimitadores {
    public boolean evaluacionDelimitadores(String cadena){
        Pila<String> pcaracteres = new Pila<String>();
        int i = 0;
        boolean masElementosPorLeer = true;
        while(i<cadena.length() && masElementosPorLeer)
        {
            char car = cadena.charAt(i);
            String s = charToString(car);
            i++;
            switch (car) {
                //en caso de apilar
                case '(':
                    pcaracteres.apilar(charToString(')'));
                    break;
                case '[':
                    pcaracteres.apilar(charToString(']'));
                    break;
                case '{':
                    pcaracteres.apilar(charToString('}'));
                    break;
                case '/':
                    if (siguienteEsAsterisco(cadena, i)){
                        pcaracteres.apilar(charToString('/'));
                        i++;
                    }
                    break;
                
                //para desapilar
                case ')':
                case ']':
                case '}':
                {
                    //comparar que corresponda
                    String aux = pcaracteres.cima();
                    if (aux !=null)
                    {
                        if(s.compareTo(aux)==0)
                        {
                            //hay correspondencia por tanto son iguales y lo elimino
                            pcaracteres.retirar();
                        }
                        else{
                            masElementosPorLeer=false;
                        }
                    }
                    //Faltaba esta linea en el versión incial
                    break;
                }
                case '*':
                {
                    if(siguienteEsDiagonal(cadena,i)){
                        pcaracteres.retirar();
                        i++;
                    }
                }

                default:
                    break;
            }

        }//termina el while
        if(pcaracteres.esVacia() && masElementosPorLeer)
           return true;
        else
           return false;

    }
    //convierte un char a un objeto tipo String
    private static String charToString(char ch){
        return String.valueOf(ch);
    }
    private static boolean siguienteEsAsterisco(String cadena,int posicion){
        char car = cadena.charAt(posicion);
        if(car == '*')
           return true;
        else
           return false;
    }
    private static boolean siguienteEsDiagonal(String cadena,int posicion){
        char car = cadena.charAt(posicion);
        if(car == '/')
           return true;
        else
           return false;
    }

    
}
