package proyectoinmobiliaria

class BootStrap {

    def init = { servletContext ->

    	//CONSULTAS 


	    def consulta1 = new Consulta(

	        pregunta:'¿Estan trabajando en el interior del pais?',
	        respuesta:'Por ahora estamos trabajando en la provincia de Catamarca. Muchas gracias por consultar'

	        )
	    consulta1.save(flush:true)

	     def consulta2 = new Consulta(

	        pregunta:'¿Cuales son los medios de pago disponibles?',
	        respuesta:'Trabajamos con efectivo, tarjetas de credito y debito y tambien creditos personales. Muchas gracias por consultar'

	        )
	     consulta2.save(flush:true)

    	//CLIENTES

    	def cliente1 = new Cliente(
    		nombre:'Roberto',
    		apellido:'Gomez',
    		dni:12398765,
    		calidadDeCliente:'Interesado',
    		direccion:'Valle viejo',
    		telefono:'6374635267',
    		email:'roberto@gmail.com'
    		)
    	cliente1.save(flush:true)

    	def cliente2 = new Cliente(
    		nombre:'Carlos',
    		apellido:'Cardozo',
    		dni:12365765,
    		calidadDeCliente:'Interesado',
    		direccion:'Terebintos',
    		telefono:'6374195267',
    		email:'carlos@gmail.com'
    		)

    	cliente2.save(flush:true)


    	def cliente3 = new Cliente(
    		nombre:'Jazmin',
    		apellido:'Palacios',
    		dni:12393465,
    		calidadDeCliente:'Interesado',
    		direccion:'Parque America',
    		telefono:'6343635267',
    		email:'jazmin@gmail.com'
    		)

    	cliente3.save(flush:true)

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
	    estado:'Disponible',
			oferta:'Si')
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
	    estado:'Disponible',
			oferta:'No')
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
	    estado:'Disponible',
			oferta:'Si')
	    prop2.save(flush:true)


 		
	    //USER

	    	def usuario1 = new Usuario(nombre:"Agustin" , apellido:"Paez" , dni:39496977 , calidadDeCliente:'User',
	    	direccion:"Parque America",telefono:1234567898, 
	    	propiedad:null, nombreUsuario: "Agustin" ,
	    	password: "12345",email: "agustin@gmail.com")
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

		    def usuario2 = new Usuario(nombre:"Juan" , apellido:"Daneri" , dni:36728281 , calidadDeCliente:'User',
	    	direccion:"Llegando a tucuman",telefono:1264567898, 
	    	propiedad:null, nombreUsuario: "Juan" ,
	    	password: "12345",email: "juan@gmail.com")
		    if(!usuario2.save(flush: true)) {
		      usuario2.errors.each{
		        println it
		      }
		    }

		    def rol2 = new Rol(authority: "OPERADOR")
		    if(!rol2.save(flush: true)) {
		      rol2.errors.each{
		        println it
		      }
		    }

		    def usuarioRol2 = new UsuarioRol(usuario: usuario2, rol: rol2)
		    if(!usuarioRol2.save(flush: true)) {
		      usuarioRol2.errors.each{
		        println it
		      }
		    }



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
