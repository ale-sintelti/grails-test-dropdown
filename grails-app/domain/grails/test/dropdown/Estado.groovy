package grails.test.dropdown

class Estado {
	String nombre
	static belongsTo=[pais:Pais]
	
    static constraints = {
		nombre(blank: false)
		pais(nullable: false)
    }
	String toString(){
		nombre
	}
}
