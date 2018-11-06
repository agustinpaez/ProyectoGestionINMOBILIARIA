package proyectoinmobiliaria

import grails.gorm.transactions.Transactional

@Transactional
class GestionService {

      List listarVentas() {
            def ofertasVentas = Propiedad.findAll("from Propiedad as p where p.categoria=:venta", [venta: 'Venta'])
            return ofertasVentas
            }

      List listarAlquiler() {
            def ofertasAlquiler = Propiedad.findAll("from Propiedad as p where p.categoria=:alquiler", [alquiler: 'Alquiler'])
            return ofertasAlquiler
            }
}
