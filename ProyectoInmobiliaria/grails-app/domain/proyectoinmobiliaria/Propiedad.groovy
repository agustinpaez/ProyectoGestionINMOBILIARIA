package proyectoinmobiliaria

class Propiedad {

        String calle
        Integer numero
        String barrio
        String localidad
        String ciudad
        BigDecimal precio
        String tipo
        Integer cantBanios
        Integer cantDormitorios
        Integer piso
        Integer nDepartamento
        String categoria
        String estado

        String oferta

    static constraints = {

        calle(blank: false, maxSize: 70)
        numero(blank: false, maxSize: 8)
        barrio(blank: false, maxSize: 50)
        localidad(blank: false, maxSize: 50)
        ciudad(blank: false, maxSize: 50)
        precio(blank: false)
        tipo(blank: false, maxSize: 50, inList:['Casa','Departamento','Local Comercial', 'Oficina'])
        cantBanios(blank:false)
        cantDormitorios(nullable:true, blank:true)
        piso(nullable:true, blank:true, max:30)
        nDepartamento(nullable:true, blank:true, max:200 )
        categoria (blank: false, maxSize: 20, inList:['Venta','Alquiler'])
        estado (blank: false, maxSize: 15, inList:['Vendida', 'Alquilada', 'Disponible'])

        oferta (blank: false, maxSize: 2, inList:['Si','No'])

    }
}
