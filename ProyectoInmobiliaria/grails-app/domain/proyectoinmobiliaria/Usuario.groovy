package proyectoinmobiliaria

class Usuario extends Cliente implements Serializable {
    
    private static final long serialVersionUID = 1

     String nombreUsuario
      String password
      String email

      
    static constraints = {
        nombreUsuario blank: false, unique: true
        password blank: false
        email blank: false, email: true, unique: true
    }
}