package proyectoinmobiliaria

class BootStrap {

    def init = { servletContext ->

    	def prop1= new Propiedad( calle:'Belgrano',
	    numero: 125,
	    barrio:'Centro',
	    localidad:'Capital',
	    ciudad: 'San Fernando del Valle de Catamarca',
	    precio: 1000000,
	    tipo:'Departamento',
	    cantBanios:1,
	    cantDormitorios:2,
	    piso:7,
	    nDepartamento:75,
	    categoria: 'Venta',
	    estado:'Disponible')
	    prop1.save(flush:true)

	 //		String calle
     //    Integer numero
     //    String barrio
     //    String localidad
     //    String ciudad
     //    BigDecimal precio
     //    String tipo
     //    Integer cantBanios
     //    Integer cantDormitorios
     //    Integer piso
     //    Integer nDepartamento
     //    String categoria
     //    String estado


    }
    def destroy = {
    }
}
