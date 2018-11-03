package proyectoinmobiliaria

class IngresarController{

  def ingresar() {
        if (request.get) {
            return render(view: 'ingresar')
        }

        
        def u = Usuario.findByEmail(params.email)
            if (u) {
            if (u.password == 123 /*u.generateMD5_A(params.password*/)) {
                    session.usuario = u

                    redirect(controller: "administracion", action: "sesion")

                    } else {
                    render(view: "ingresar", model: [message: "Constraseña Incorrecta"])
                    }
            } else {
                render(view: "ingresar", model: [message: "No existe el usuario ingresado"])
            }
        }

    def logout() {
      session.usuario=null
      render(view: "/administracion/principal")
    }
    
}
