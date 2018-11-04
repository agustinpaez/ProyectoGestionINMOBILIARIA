package proyectoinmobiliaria

class BootStrap {

    def init = { servletContext ->

    	//PROPIEDADES

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

	    def prop3= new Propiedad( calle:'Rivadavia',
	    numero: 0,
	    barrio:'Centro',
	    localidad:'Capital',
	    ciudad: 'San Fernando del Valle de Catamarca',
	    precio: 4500000,
	    tipo:'Casa',
	    cantBanios:2,
	    cantDormitorios:4,
	    piso:0,
	    nDepartamento:0,
	    categoria: 'Venta',
	    estado:'Disponible')
	    prop3.save(flush:true)

	    def prop2= new Propiedad( calle:'Brasil',
	    numero: 1250,
	    barrio:'Parque America',
	    localidad:'Capital',
	    ciudad: 'San Fernando del Valle de Catamarca',
	    precio: 1900000,
	    tipo:'Casa',
	    cantBanios:1,
	    cantDormitorios:3,
	    piso:0,
	    nDepartamento:0,
	    categoria: 'Alquiler',
	    estado:'Disponible')
	    prop2.save(flush:true)


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



	 //Usuario

	   /* def usuario1 = new Usuario(
			nombre:"Juan",
    		apellido:"Daneri",
     		dni:4124214,
     		direccion:"sdfsdf",
     		telefono:1234567899,
			nombreUsuario: "Juan",
			password: "12345",
			email: "juan@gmail.com")
    	if(!usuario1.save(flush: true)) {
			usuario1.errors.each{
			println it
      		}	
    	}
		def rol1 = new Rol(authority: "ADMINISTRADOR")
		if(!rol1.save(flush: true)) {
		rol1.errors.each{
				println it
			}
		}

		def usuarioRol1 = new UsuarioRol(usuario: usuario1, rol: rol1)
    	if(!usuarioRol1.save(flush: true)) {
    	usuarioRol1.errors.each{
        		println it
      		}
    	}
*/

    }
    def destroy = {
    }
}
