package Inmobiliaria

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ClienteController {

    ClienteService clienteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond clienteService.list(params), model:[clienteCount: clienteService.count()]
    }

    def show(Long id) {
        respond clienteService.get(id)
    }

    def create() {
        respond new Cliente(params)
    }

    def save(Cliente cliente) {
        if (cliente == null) {
            notFound()
            return
        }

        try {
            clienteService.save(cliente)
        } catch (ValidationException e) {
            respond cliente.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'cliente.label', default: 'Cliente'), cliente.id])
                redirect cliente
            }
            '*' { respond cliente, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond clienteService.get(id)
    }

    def update(Cliente cliente) {
        if (cliente == null) {
            notFound()
            return
        }

        try {
            clienteService.save(cliente)
        } catch (ValidationException e) {
            respond cliente.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'cliente.label', default: 'Cliente'), cliente.id])
                redirect cliente
            }
            '*'{ respond cliente, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        clienteService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'cliente.label', default: 'Cliente'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'cliente.label', default: 'Cliente'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
<<<<<<< HEAD

    def login() {
   if (request.get) {
     return render(view: 'login')
   }
 }

<<<<<<< HEAD

=======
>>>>>>> d0ef5f1850dadcb713bd03187af15eec069342de
    // def login() {
    //     if (request.get) {
    //         return render(view: 'login')
    //     }
    //     return render(view: 'login')
    // }

    // login user

    // def login() {

    //     if (params.email == 'a@g.com' && params.password == 'admin'){
    //         flash.message= "Inicio correcto"
    //     }else{
    //         flash.message= "Inicio erroneo"
    //     }

    //     redirect(action: 'index')
   // if (request.get) {
   //   return render(view: 'login')
   // }

   //  def u = Persona.findByEmail(params.mail)
   //   if (u) {
   //     if (u.password == u.generateMD5_A(params.password)) {
   //        session.usuario = u

   //        redirect(controller: "administracion", action: "sesion")

   //      } else {
   //        render(view: "login", model: [message: "Constraseña Incorrecta"])
   //      }
   //    } else {
   //      render(view: "login", model: [message: "No existe el usuario ingresado"])
   //    }
   //  }

   //  def logout() {
   //    session.usuario=null
   //    render(view: "/administracion/principal")
   //  }

=======
}
>>>>>>> parent of 28b0ee5... falta error login
