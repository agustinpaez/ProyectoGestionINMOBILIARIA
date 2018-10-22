package Inmobiliaria

import grails.gorm.services.Service

@Service(Inmobiliaria)
interface InmobiliariaService {

    Inmobiliaria get(Serializable id)

    List<Inmobiliaria> list(Map args)

    Long count()

    void delete(Serializable id)

    Inmobiliaria save(Inmobiliaria inmobiliaria)

}