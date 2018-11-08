package proyectoinmobiliaria

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/propiedad/indexPrincipal", controller: 'propiedad', action:'indexPrincipal')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
