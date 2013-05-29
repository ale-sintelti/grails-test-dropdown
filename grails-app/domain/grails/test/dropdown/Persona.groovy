package grails.test.dropdown

class Persona {
	String nombre
	String apellidoPaterno
	String apellidoMaterno
	Estado estado
    static constraints = {
		nombre(blank: false)
		apellidoPaterno(blank: false)
		apellidoMaterno(blank: false)
		estado(nullable: false)
    }
	String toSrting(){
		"$nombre $apellidoPaterno $apellidoMaterno"
	}
}
