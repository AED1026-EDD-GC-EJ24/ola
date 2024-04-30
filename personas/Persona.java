package personas;
/*
 * crear una lista de Personas donde tengamos un conjunto de Personas 
 * con sus alturas correspondientes.
 *  A modo de estadística queremos calcular la estatura media de ese conjunto de Personas
 *  con la implementación de un ArrayList.
 */

public class Persona{

    private int idPersona;

    private String nombre;

    private int altura;
 

    public Persona(int idPersona, String nombre, int altura) {

        this.idPersona = idPersona;

        this.nombre = nombre;

        this.altura = altura;}

    public int getAltura() {
         return altura;
    } //Omitimos otros métodos get y set para simplificar

    @Override

    public String toString() {

        return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura+"\n";

    }

}
    

