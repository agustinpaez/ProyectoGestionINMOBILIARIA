package proyectoinmobiliaria

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PropiedadController {

    PropiedadService propiedadService
    def GestionService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def venta(){
        [listadoVentas: GestionService.listarVentas()]
    }

    def alquiler(){
        [listadoAlquiler: GestionService.listarAlquiler()]
    }

    def buscar(){
        println(params.buscar)
        [listadoBuscar: GestionService.listarBusqueda(params.buscar)]
    }

    def oferta(){
        [listadoOferta: GestionService.listarOferta()]
    }

    def indexPrincipal(){
        [listadoTodo: GestionService.listarTodo()]
    }
    
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond propiedadService.list(params), model:[propiedadCount: propiedadService.count()]
    }

    def verImagen = {
        def Propiedad = Propiedad.get(params.id)      
        response.outputStream << Propiedad.imagen
        response.outputStream.flush()      
    }

    def show(Long id) {
        respond propiedadService.get(id)
    }

    def create() {
        respond new Propiedad(params)
    }

    def save(Propiedad propiedad) {
        if (propiedad == null) {
            notFound()
            return
        }

        try {
            propiedadService.save(propiedad)
        } catch (ValidationException e) {
            respond propiedad.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'propiedad.label', default: 'Propiedad'), propiedad.id])
                redirect propiedad
            }
            '*' { respond propiedad, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond propiedadService.get(id)
    }

    def update(Propiedad propiedad) {
        if (propiedad == null) {
            notFound()
            return
        }

        try {
            propiedadService.save(propiedad)
        } catch (ValidationException e) {
            respond propiedad.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'propiedad.label', default: 'Propiedad'), propiedad.id])
                redirect propiedad
            }
            '*'{ respond propiedad, [status: OK] }
        }
    }


    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        propiedadService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'propiedad.label', default: 'Propiedad'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'propiedad.label', default: 'Propiedad'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

}
