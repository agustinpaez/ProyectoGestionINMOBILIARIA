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
                        session.usuario = u 
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

 //    if (request.get) {
 // return 
 // def u = User.findByLogin(params.login)
 // if (u) {
 // if (u.password == params.password) {
 // session.user = u
 // redirect(action: "home")
 // } else {
 // render(view: "login", model:
 // [message: "Password incorrect"])
 // }
 // } else {
 // render(view: "login", model:
 // [message: "User not found"]) } }

    def iniciar(){
        
    }

    def logout() {
      session.usuario=null
      render(view: "../index")

    }

}
