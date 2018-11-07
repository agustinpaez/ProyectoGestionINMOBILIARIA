package proyectoinmobiliaria

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/propiedad/indexPrincipal")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
