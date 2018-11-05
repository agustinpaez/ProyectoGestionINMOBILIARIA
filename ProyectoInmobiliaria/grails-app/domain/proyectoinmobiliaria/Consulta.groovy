package proyectoinmobiliaria

class Consulta {

	String pregunta
	String respuesta

    static constraints = {
    	pregunta(blank:false)
    	respuesta(blank:true)
    }
}
