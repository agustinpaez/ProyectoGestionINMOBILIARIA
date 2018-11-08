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

}
