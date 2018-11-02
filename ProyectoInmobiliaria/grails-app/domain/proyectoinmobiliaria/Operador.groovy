package proyectoinmobiliaria

class Operador {
    
    String nombre
    String apellido
    Long dni
    String direccion
    String telefono
    String email

static hasMany = [vendidas:Propiedad]

  static constraints = {

  usuario (unique:true, blank :false, maxSize:30)
  contrasenia(blank : false , maxSize : 10)
  vendidas (nullable:true)
  }

}
