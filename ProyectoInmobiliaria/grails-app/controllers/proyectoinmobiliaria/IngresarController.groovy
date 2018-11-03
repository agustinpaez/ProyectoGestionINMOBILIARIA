package proyectoinmobiliaria

class IngresarController{

  def ingresar() {
        if (request.get) {
            render(view: 'ingresar')
        }
        def u = Usuario.findByEmail(params.email)
            if (u) {
            if (u.password == params.password) {
                    session.usuario = u
                    redirect(controller:'cliente', action:'index')

                    } else {
                    render(view: "ingresar", model: [message: "Constraseña Incorrecta"])
                    }
            } else {
                render(view: "ingresar", model: [message: "No existe el usuario ingresado"])
            }
    }

    def iniciar(){
        
    }

    def logout() {
      session.usuario=null
    }

}
