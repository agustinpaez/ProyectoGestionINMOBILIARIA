package Inmobiliaria

class Propiedad extends Inmobiliaria{

	String clasificacion
	String localizacion
	Cliente comprador
	Cliente vendedor
	String estado_propiedad 

    static constraints = {

		clasificacion(blank: false)
		localizacion(blank: false)
		comprador(blank: false)
		vendedor(blank: false)
		estado_propiedad(blank: false)
    }
}
