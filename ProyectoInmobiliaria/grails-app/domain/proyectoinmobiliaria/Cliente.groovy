package proyectoinmobiliaria

class Cliente {

    String nombre
    String apellido
    Long dni
    String calidadDeCliente
    String direccion
    String telefono
    String email
    Propiedad propiedad


    static constraints = {
        nombre(blank: false, maxSize: 50)
        apellido(blank: false, maxSize: 50)
        dni(blank: false, unique: true)
        calidadDeCliente(blank: false, maxSize: 50, inList:['Interesado','Comprador','Vendedor', 'User'])
        direccion (blank:false, maxSize: 50)
        telefono(blank:true,matches:"[0-9]{10}")
        email(blank:true,email:true, unique:true)
        propiedad(nullable:true)
    }
}
