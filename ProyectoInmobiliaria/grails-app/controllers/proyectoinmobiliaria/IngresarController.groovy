package proyectoinmobiliaria

class IngresarController{

  def ingresar() {
        if (request.get) {
            render(view: 'ingresar')
        }
        def u = Usuario.findByEmail(params.email)
            if (u) {
            if (u.password == params.password) {
                    if(u.email=='agustin@gmail.com') {
                        redirect(controller: "cliente", action: "portada")
                    }else{
                        session.usuario = u
                        redirect(controller:'cliente', action:'portada')          
                    }

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
