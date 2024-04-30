package miPrincipal;

public class ListaDeContactos {
    //Atributo
    private Lista<Contacto> contactos;
    //Metodos
    //Constructor

    public ListaDeContactos() {
        contactos = new Lista<Contacto>();
    }
    /*
     * Retorma una lista de todos los contactos
     */
    public Lista<Contacto> mostrasTodosLosContactos(){
        return contactos;

    }
    /*
     * Agrega un nuevo contacto a la lista, si todavía no hay 
     * ningún contacto
     * con los nombres y apellidos dados
     */
    public boolean agregarContacto(String nombres, String apellidos,
           String direccion, String correo, String telefono,
           String celular) throws PosicionIlegalException{
            Contacto con = buscarContacto(nombres,apellidos);
            if(con ==null){
                Contacto nuevo = new Contacto(nombres,apellidos,direccion,
                         correo,telefono,celular);
                contactos.agregar(nuevo);
                return true;

            }
            else{
                return false;
            }


    }
    /*
     * Elimina un cotacto dado sus nombres y apellidos
     * si el usuario existe en la lista se elimina
     * @return true si se puede eliminar, false en caso contrario
     * @throws PosicionIlegalException
     */

    public boolean eliminarContacto(String nombres,String apellidos)
        throws PosicionIlegalException{
          Contacto con = buscarContacto(nombres,apellidos);
        if (con != null){
            for(int i=0;i<contactos.getTamanio();i++){
                Contacto contAux = contactos.getValor(i);
                if(contAux.getNombres().equals(nombres) && 
                   contAux.getApellidos().equals(apellidos))
                {
                    contactos.remover(i);
                }

            }
            return true;
            
        } else{
            return false;
        } 
           

    }
    public boolean modificarContacto(String nombres, String apellidos,
            String direccion, String correo, String telefono, 
            String celular) throws PosicionIlegalException{
            //verificar si el contacto existe
            Contacto con = buscarContacto(nombres, apellidos);
            if (con==null){
                return false;
            }else{
                con.setNombres(nombres);
                con.setApellidos(apellidos);
                con.setDireccion(direccion);
                con.setCorreo(correo);
                con.setTelefono(telefono);
                con.setCelular(celular);
                return true;
            }



    }

    /*
     * Busca un contacto dado sus nombres y apellidos
     * @return el contactp si se encuentra, null en caso contrario
     * 
     */
    public Contacto buscarContacto(String nombres, String apellidos) throws 
          PosicionIlegalException{
            for(int i=0;i<contactos.getTamanio();i++){
                Contacto con = contactos.getValor(i);
                if(nombres.equals(con.getNombres()) && 
                   apellidos.equals(con.getApellidos())){
                    return con;
                }

            }
            return null; //No lo encontro, devuelve nulo

          }
}
