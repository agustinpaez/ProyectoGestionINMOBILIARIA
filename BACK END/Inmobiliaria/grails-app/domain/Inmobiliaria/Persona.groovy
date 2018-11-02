package Inmobiliaria

class Persona {

	String nombre
	String apellido
	long dni
	long telefono
	String direccion
	String email

    static constraints = {

		nombre(blank: false, maxsize: 100)
		apellido(blank: false, maxsize: 100)
		dni(blank: false, unique: true)
		telefono(blank: true, matches: "[0-9]{3}-[0-9]{7}")
		direccion(blank: false, maxsize: 100)
		email(blank: false, maxsize: 100, email:true)


    }
}
