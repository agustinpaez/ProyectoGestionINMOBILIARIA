package proyectoinmobiliaria

class BootStrap {

    def init = { servletContext ->

    	def prop1= new Propiedad( calle:'Belgrano',
	    numero: 125,
	    barrio:'Centro',
	    localidad:'Capital',
	    ciudad: 'San Fernando del Valle de Catamarca',
	    superficie: 64,
	    precio: 1000000,
	    rubro: 'venta',
	    categoria:'Casa',
	    cantDormitorio:2,
	    cantBanios:1,
	    estado:'Libre')
	    prop1.save(flush:true)


	    def prop2= new Propiedad( calle:'Rivadavia',
	    numero: 15,
	    barrio:'9 de Julio',
	    localidad:'Capital',
	    ciudad: 'San Fernando del Valle de Catamarca',
	    superficie: 100,
	    precio: 90000,
	    rubro: 'venta',
	    categoria:'Local',
	    cantDormitorio:3,
	    cantBanios:2,
	    estado:'Libre')
	    prop2.save(flush:true)

    }
    def destroy = {
    }
}
