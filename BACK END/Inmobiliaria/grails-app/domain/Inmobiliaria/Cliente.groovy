package Inmobiliaria

class Cliente extends Persona{

	String id_cliente
	String password
	Date fecha_inicio

    static hasMany = [propiedades: Propiedad, contratos: Contrato]

    static constraints = {

        id_cliente(blank: false, unique: true)
        fecha_inicio(blank: false)


    }
}
