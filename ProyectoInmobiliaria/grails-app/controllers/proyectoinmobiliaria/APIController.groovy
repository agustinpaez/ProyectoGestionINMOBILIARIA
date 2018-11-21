package proyectoinmobiliaria
import grails.rest.RestfulController


class APIController extends RestfulController<Propiedad>{


    static responseFormats = ['json', 'xml']

    APIController(){
        super(Propiedad)
    }
    
    def listaPorCategoria(String p){
        def t = "%" + p + "%"
        if (t)
            respond Propiedad.findAllByCategoriaLike(t)
        else
            respond ([])
    }



}

