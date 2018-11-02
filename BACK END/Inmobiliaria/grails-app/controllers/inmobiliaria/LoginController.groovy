package inmobiliaria

class LoginController {

    def index() { }


    def login() {
   if (request.get) {
     return render(view: 'login')
   }
}

    // def u = Persona.findByEmail(params.email)
    //  if (u) {
    //    if (u.password == u.generateMD5_A(params.password)) {
    //       session.usuario = u

    //       // redirect(controller: "administracion", action: "sesion")
    //       redirect(view:"index", model: [message: "Ingreso Correcto"])

    //     } else {
    //       render(view: "login", model: [message: "Constraseña Incorrecta"])
    //     }
    //   } else {
    //     render(view: "login", model: [message: "No existe el usuario ingresado"])
    //   }
    // }

    // def logout() {
    //   session.usuario=null
    //   render(view: "/administracion/principal")
    // }


    // def login() {


    	// render (view:'login')
     //    if (params.email == 'a@g.com' && params.password == 'admin'){
     //        flash.message= "Inicio correcto"
     //    }else{
     //        flash.message= "Inicio erroneo"
     //    }
    // } 

