package Inmobiliaria

class Contrato {

	Date fecha_inicio
	Date fecha_fin
	BigDecimal valor_propiedad
	BigDecimal monto
	
	Propiedad propiedad

	static belongsTo = [cliente: Cliente]
	

    static constraints = {
		
		fecha_inicio(blank:false)
		fecha_fin(blank:false)
		valor_propiedad(blank:false)
    }
}
