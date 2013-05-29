import grails.test.dropdown.*
class BootStrap {

    def init = { servletContext ->
	def mexico = new Pais(nombre: "M�xico").save(flush: true)
	def estadosUnidos = new Pais(nombre: "Estados Unidos").save(flush: true)
	new Estado(
		nombre: "Puebla",
		pais: mexico
	).save(flush: true)
	
	new Estado(
		nombre: "Veracruz",
		pais: mexico
	).save(flush: true)
	
	new Estado(
		nombre: "Michigan",
		pais: estadosUnidos
	).save(flush: true)
	
	new Estado(
		nombre: "Minnesota",
		pais: estadosUnidos
	).save(flush: true)
	}
    def destroy = {
    }
}
