package Inmobiliaria

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class InmobiliariaController {

    InmobiliariaService inmobiliariaService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond inmobiliariaService.list(params), model:[inmobiliariaCount: inmobiliariaService.count()]
    }

    def show(Long id) {
        respond inmobiliariaService.get(id)
    }

    def create() {
        respond new Inmobiliaria(params)
    }

    def save(Inmobiliaria inmobiliaria) {
        if (inmobiliaria == null) {
            notFound()
            return
        }

        try {
            inmobiliariaService.save(inmobiliaria)
        } catch (ValidationException e) {
            respond inmobiliaria.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'inmobiliaria.label', default: 'Inmobiliaria'), inmobiliaria.id])
                redirect inmobiliaria
            }
            '*' { respond inmobiliaria, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond inmobiliariaService.get(id)
    }

    def update(Inmobiliaria inmobiliaria) {
        if (inmobiliaria == null) {
            notFound()
            return
        }

        try {
            inmobiliariaService.save(inmobiliaria)
        } catch (ValidationException e) {
            respond inmobiliaria.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'inmobiliaria.label', default: 'Inmobiliaria'), inmobiliaria.id])
                redirect inmobiliaria
            }
            '*'{ respond inmobiliaria, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        inmobiliariaService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'inmobiliaria.label', default: 'Inmobiliaria'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'inmobiliaria.label', default: 'Inmobiliaria'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
