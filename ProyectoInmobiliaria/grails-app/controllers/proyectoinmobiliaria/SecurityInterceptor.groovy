package proyectoinmobiliaria


class SecurityInterceptor {

	SecurityInterceptor() {
 		
 	  match(controller:"cliente", action:"index")
      match(controller:"cliente", action:"edit")
      match(controller:"cliente", action:"show")
      match(controller:"cliente", action:"create")
       match(controller:"cliente", action:"portada")

      match(controller:"consulta", action:"index")
      match(controller:"consulta", action:"create")
      match(controller:"consulta", action:"edit")
      match(controller:"consulta", action:"show")

      match(controller:"propiedad", action:"index")
      match(controller:"propiedad", action:"create")
      match(controller:"propiedad", action:"edit")
      match(controller:"propiedad", action:"show")

      match(controller:"usuario", action:"index")
      match(controller:"usuario", action:"create")
      match(controller:"usuario", action:"edit")
      match(controller:"usuario", action:"show")
 	}

    boolean before() { 

    	if (!session.usuario && actionName != "ingresar") {
		 redirect(controller: "ingresar", action: "ingresar")
		 return false
		 }
		 return true 


     }

    boolean after() { 

     match(controller:"cliente", action:"index")
      match(controller:"cliente", action:"edit")
      match(controller:"cliente", action:"show")
      match(controller:"cliente", action:"create")
      match(controller:"cliente", action:"portada")

      match(controller:"consulta", action:"index")
      match(controller:"consulta", action:"create")
      match(controller:"consulta", action:"edit")
      match(controller:"consulta", action:"show")

      match(controller:"propiedad", action:"index")
      match(controller:"propiedad", action:"create")
      match(controller:"propiedad", action:"edit")
      match(controller:"propiedad", action:"show")

      match(controller:"usuario", action:"index")
      match(controller:"usuario", action:"create")
      match(controller:"usuario", action:"edit")
      match(controller:"usuario", action:"show")

     }

    void afterView() {

    }
}
