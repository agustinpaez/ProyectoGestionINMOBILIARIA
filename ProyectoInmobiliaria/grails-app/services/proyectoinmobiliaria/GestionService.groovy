package proyectoinmobiliaria

import grails.gorm.transactions.Transactional

@Transactional
class GestionService {

      List listarVentas() {
            def ventas = Propiedad.findAll("from Propiedad as p where p.categoria=:venta", [venta: 'Venta'])
            return ventas
            }

      List listarAlquiler() {
            def alquiler = Propiedad.findAll("from Propiedad as p where p.categoria=:alquiler", [alquiler: 'Alquiler'])
            return alquiler
            }

      List listarTodo() {
            def todo = Propiedad.findAll("from Propiedad as p where p.categoria=:alquiler or p.categoria=:venta", [alquiler: 'Alquiler', venta: 'Venta'])
            return todo
            }

      List listarOferta() {
            def oferta = Propiedad.findAll("from Propiedad as p where p.oferta=:oferta", [oferta: 'Si'])
            return oferta
            }

      List listarBusqueda(String buscar) {

            def busqueda = Propiedad.findAll("from Propiedad as p where p.calle=:parametro or p.localidad=:parametro or p.ciudad=:parametro or p.categoria=:parametro", [parametro: buscar])

            return busqueda
            }


// ("from Propiedad as p where (p.rubro=:rubros and p.localidad=:localidades and p.barrio=:barrios)", [rubros: rubro, localidades: localidad, barrios: barrio])

      // List buscarCliente(params){
      //       def clientes = Cliente.findAllByNomeLike(params)
      //       return clientes
      //       }

}
